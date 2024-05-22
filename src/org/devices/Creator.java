package org.devices;

public class Creator {
    public static Device create(String type){
        if(type.equals("DVDPLAYER")){
            return new DvdPlayer();
        } else if (type.equals("PLAYSTATION")) {
            return new Playstation();
        } else {
            throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
