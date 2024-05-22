package org.devices;

public class Playstation extends Device{
    @Override
    public void play() {
        System.out.println("I am a Playstation and I am in \"Play\" mode.");
    }

    @Override
    public void stop() {
        System.out.println("I am a Playstation and I am in \"Stop\" mode.");
    }
}
