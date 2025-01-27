package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithPositionAndOtherData {

    @Test
    public void decodeWithPositionAndOtherData() throws Exception {
        String data = "{\"position\":{\"latitude\":1.0,\"longitude\":2.0,\"altitude\":3.0},\"speed\":4.5,\"course\":5.6}";
        Protocol protocol = createGalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decodedMessage = decoder.decode(null, null, data);
        assertTrue(decodedMessage instanceof Position);
    }

}

class Position {
    public double latitude;
    public double longitude;
    public double altitude;

    public Position(double lat, double lon, double alt) {
        this.latitude = lat;
        this.longitude = lon;
        this.altitude = alt;
    }
}

interface Protocol {
    Object decode(String message);
}

public class GalileoProtocol implements Protocol {
    @Override
    public Object decode(String message) {
        // implement protocol here
        return null;
    }

}