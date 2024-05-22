package org.devices;

public class DvdPlayer extends Device{
    @Override
    public void play() {
        System.out.println("I am a DVD Player and I am in \"Play\" mode.");
    }

    @Override
    public void stop() {
        System.out.println("I am a DVD Player and I am in \"Stop\" mode.");
    }
}
