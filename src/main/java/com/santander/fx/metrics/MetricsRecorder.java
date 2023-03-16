package com.santander.fx.metrics;

public abstract class MetricsRecorder {

    protected long id;
    protected long metric;

    public void record(long id,long metric){
        this.id = id;
        this.metric = metric;

        commit();
    }

    protected abstract void commit();

    public static void main(String[] args) {
        //new MetricsRecorder().record(1L,1L);
    }
}
