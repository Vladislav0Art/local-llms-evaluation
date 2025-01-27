package org.traccar.protocol;

public class GeneratedTest {

    private double lat;
    private double lon;

    public Position(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    // Public method to get position data
    public String getPosition() {
        return "lat=" + lat + ",lon=" + lon;
    }
}

public class GalileoProtocol implements Protocol {
    @Override
    public void decode(String message) throws Exception {
        // implementation
    }
}

public interface Protocol {
    Object decode(String message);
}

public class GalileoProtocolDecoder {
    private Protocol protocol;

    public GalileoProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    public Object decode(String message, String param1, String param2) throws Exception {
        return protocol.decode(message);
    }
}

public class GeneratedTest {

}