package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {
//        System.out.println("TrackCouch: inside no-arg constructor");
    }

    public TrackCoach(FortuneService fortuneService) {
//        System.out.println("TrackCouch: inside constructor ");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do IT: " + fortuneService.getFortune();
    }


}
