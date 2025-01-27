package org.traccar.protocol;

public class GeneratedTestWatchProtocol {

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
    public void testWatchProtocol() {
        WatchProtocol watchProtocol = new WatchProtocol(true, 1, 37.7749, -122.4194);
        System.out.println(watchProtocol.getType());
        System.out.println(watchProtocol.getCode());
        System.out.println(watchProtocol.getLatitude());
        System.out.println(watchProtocol.getLongitude());
    }

}