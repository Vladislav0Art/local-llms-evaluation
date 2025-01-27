package org.traccar.protocol;

public class GeneratedTest {

    private boolean type;
    private int code;
    private double latitude;
    private double longitude;

    public WatchProtocol(boolean type, int code, double latitude, double longitude) {
        this.type = type;
        this.code = code;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

public class WatchProtocolDecoder {
    public void decode(Protocol protocol, byte[] input) {
        // decoding logic
    }
}

public class Protocol {
    private boolean type;
    private int code;

    public Protocol(boolean type, int code) {
        this.type = type;
        this.code = code;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

public class GeneratedTest {

}