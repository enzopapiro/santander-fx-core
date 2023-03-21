package com.santander.fx.metrics;

import com.santander.fx.domain.Application;
import com.santander.fx.domain.Environment;
import com.santander.fx.util.time.Clock;

public class AppMetrics {

    public static AppMetricsContextVer1 getVer1(Clock clock, Environment env, Application application, String instance){
        return new AppMetricsContextVer1(clock,env,application,instance);
    }
    public static AppMetricsContextVer2 getVer2(Clock clock, Environment env, Application application, String instance){
        return new AppMetricsContextVer2(clock,env,application,instance);
    }
}
