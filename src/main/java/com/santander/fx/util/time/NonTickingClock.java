package com.santander.fx.util.time;

public class NonTickingClock implements Clock {

    private long currentTime;

    public NonTickingClock() {
    }

    public void setCurrentTime(long currentTime){
        this.currentTime = currentTime;
    }

    public void moveTimeBy(long adjustment){
        this.currentTime += adjustment;
    }

    @Override
    public long getTime() {
        return this.currentTime;
    }
}
