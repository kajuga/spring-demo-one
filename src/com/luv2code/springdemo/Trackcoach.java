package com.luv2code.springdemo;

public class Trackcoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


}
