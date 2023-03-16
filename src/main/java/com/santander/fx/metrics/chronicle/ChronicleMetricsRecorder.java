package com.santander.fx.metrics.chronicle;

import com.santander.fx.metrics.MetricsRecorder;
import net.openhft.chronicle.queue.ChronicleQueue;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.RollCycles;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueue;
import net.openhft.chronicle.wire.WireOut;
import org.jetbrains.annotations.NotNull;

public class ChronicleMetricsRecorder extends MetricsRecorder {

    private final String qPath;
    private final RollCycles rollCycles;
    private SingleChronicleQueue q;

    ChronicleMetricsRecorder(String qPath, RollCycles rollCycles){
        this.qPath = qPath;
        this.rollCycles = rollCycles;
    }

    public void initialise() {
        q = ChronicleQueue.singleBuilder("./test").rollCycle(rollCycles).build();
    }

    public void write(@NotNull WireOut wire){
        wire.getValueOut().writeLong(System.nanoTime());
    }

    private void write(long id,long metric){
        @NotNull ExcerptAppender appender = q.acquireAppender();
        appender.writeDocument(this::write);
    }

    @Override
    protected void commit() {

    }
}
