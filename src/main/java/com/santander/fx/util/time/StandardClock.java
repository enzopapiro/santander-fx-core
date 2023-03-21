package com.santander.fx.util.time;

public class StandardClock implements Clock {
    @Override
    public long getTime() {
        return System.currentTimeMillis();
    }
}
