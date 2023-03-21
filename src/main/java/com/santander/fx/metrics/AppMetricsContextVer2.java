package com.santander.fx.metrics;

import com.santander.fx.domain.Application;
import com.santander.fx.domain.Environment;
import com.santander.fx.domain.ver1.Event;
import com.santander.fx.util.time.Clock;
import com.santander.fx.util.time.StandardClock;

public class AppMetricsContextVer2 {
    private Clock clock;
    private Environment env;
    private Application application;
    private String instance;

    AppMetricsContextVer2(Clock clock, Environment env, Application application, String instance){
        this.env = env;
        this.application = application;
        this.instance = instance;
        this.clock = clock;
    }

    public void stamp(){
        // timestamp and publish the application start event.
    }

    public <T extends Enum<T>> void stamp(T event, CharSequence correlationId1){
        // timestamp and publish event
    }
    public <T extends Enum<T>> void stamp(T event, CharSequence correlationId1, CharSequence correlationId2){
        // timestamp and publish event
    }
    public <T extends Enum<T>> void stamp(T event, CharSequence correlationId1, CharSequence correlationId2, CharSequence correlationId3){
        // timestamp and publish event
    }

    public static void main(String[] args) {
        AppMetricsContextVer2 metrics = AppMetrics.getVer2(new StandardClock(), Environment.PRE, Application.Neutrino, "TEST");

        metrics.stamp(Event.QuoteRequest,"FXALL123");
        //
        // Processing ...
        //
        metrics.stamp(Event.Quote,"FXALL123");
    }
}
