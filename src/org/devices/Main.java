package org.devices;

public class Main {
    public static void main(String[] args) {
        Device dvdPlayer1 = Creator.create("DVDPLAYER");
        Device playstation1 = Creator.create("PLAYSTATION");

        dvdPlayer1.play();
        dvdPlayer1.stop();
        playstation1.play();
        playstation1.stop();
    }
}
