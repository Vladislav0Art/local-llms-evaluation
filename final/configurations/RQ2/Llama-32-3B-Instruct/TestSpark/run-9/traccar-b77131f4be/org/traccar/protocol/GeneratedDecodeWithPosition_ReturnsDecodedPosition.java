package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithPosition_ReturnsDecodedPosition {

    @Test
    public void decodeWithPosition_ReturnsDecodedPosition() throws Exception {
        Position position = new Position(1.0, 2.0, 3.0);
        Protocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decodedMessage = decoder.decode(null, null, "position=" + position);
        assertTrue(decodedMessage instanceof Position);
    }

    public static class Position {
        private double lat;
        private double lon;

        public Position(double lat, double lon) {
            this.lat = lat;
            this.lon = lon;
        }
    }

    public static class GalileoProtocol implements Protocol {
        @Override
        public void decode(String message) throws Exception {
            // implementation
        }
    }

    public interface Protocol {
        void decode(String message) throws Exception;
    }

}