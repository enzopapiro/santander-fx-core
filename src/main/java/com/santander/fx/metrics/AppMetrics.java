package com.santander.fx.metrics;

import com.santander.fx.domain.Application;
import com.santander.fx.domain.Environment;
import com.santander.fx.util.time.Clock;

public class AppMetrics {

    public static AppMetricsContext get(Clock clock, Environment env, Application application, String instance){
        return new AppMetricsContext(clock,env,application,instance);
    }
}
