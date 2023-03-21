package com.santander.fx.metrics;

import com.santander.fx.domain.Application;
import com.santander.fx.domain.Environment;
import com.santander.fx.domain.Event;
import com.santander.fx.domain.EventCategory;
import com.santander.fx.util.time.Clock;

public class AppMetricsContext {

    private Clock clock;
    private Environment env;
    private Application application;
    private String instance;

    AppMetricsContext(Clock clock, Environment env, Application application, String instance){
        this.env = env;
        this.application = application;
        this.instance = instance;
        this.clock = clock;
    }
    public void stamp(Event event, CharSequence correlationId1){

    }
    void stamp(Event event, CharSequence correlationId1, CharSequence correlationId2){

    }
    void stamp(Event event, CharSequence correlationId1, CharSequence correlationId2, CharSequence correlationId3){

    }
}