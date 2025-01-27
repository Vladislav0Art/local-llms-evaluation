package org.traccar.protocol;

public class GeneratedTestWatchProtocolDecoder {

    public boolean type;
    public int code;
    public double latitude;
    public double longitude;

    public WatchProtocol(boolean type, int code, double latitude, double longitude) {
        this.type = type;
        this.code = code;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "WatchProtocol{" +
                "type=" + type +
                ", code=" + code +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

public class WatchProtocolDecoder {
    public void decode(Protocol protocol, ByteBuf input) {
        // decoding logic
    }
}

public class GeneratedTest {

    @Test
    public void testWatchProtocolDecoder() {
        WatchProtocol watchProtocol = new WatchProtocol(true, 1, 37.7749, -122.4194);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        ByteBuf input = Unpooled.copiedBuffer(4);
        // set input data for decoding
        decoder.decode(new Protocol(), input);
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