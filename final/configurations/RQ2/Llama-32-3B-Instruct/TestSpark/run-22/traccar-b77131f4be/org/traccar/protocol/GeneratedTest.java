package org.traccar.protocol;

public class GeneratedTest {

    private int latitude;
    private int longitude;

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }
}

public class Protocol {
    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}

public class GalileoProtocolDecoder {
    private Position position;

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}

public class TestGalileoProtocolDecoder extends TestCase {
    private Protocol protocol;
    private GalileoProtocolDecoder decoder;

    @Before
    public void setUp() throws Exception {
        protocol = new Protocol();
        protocol.setVersion("1");

        decoder = new GalileoProtocolDecoder();
        decoder.setPosition(new Position());
        decoder.getPosition().setLatitude(42);
        decoder.getPosition().setLongitude(42);
        decoder.getPosition().setPosition(new Position(42, 42));
    }

}