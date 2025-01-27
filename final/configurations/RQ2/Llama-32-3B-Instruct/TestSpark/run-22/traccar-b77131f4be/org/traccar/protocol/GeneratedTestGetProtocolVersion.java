package org.traccar.protocol;

public class GeneratedTestGetProtocolVersion {

    private int id;
    private byte[] bytes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getBytes() {
        return bytes;
    }
}

public class Position {
    private double latitude;
    private double longitude;
    private double altitude;
    private long timestamp;

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

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public long getTimestamp() {
        return timestamp;
    }
}

public class Protocol {
    private int version;

    public int getVersion() {
        return version;
    }
}

public class GalileoProtocolDecoder {
    private Protocol protocol;

    public GalileoProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    public Protocol getProtocol() {
        return protocol;
    }
}

public class TestGalileoProtocolDecoder {

    @Test
    public void testGetProtocolVersion() {
        Protocol protocol = new Protocol();
        protocol.setVersion(1);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertEquals(1, decoder.getProtocol().getVersion());
    }

}