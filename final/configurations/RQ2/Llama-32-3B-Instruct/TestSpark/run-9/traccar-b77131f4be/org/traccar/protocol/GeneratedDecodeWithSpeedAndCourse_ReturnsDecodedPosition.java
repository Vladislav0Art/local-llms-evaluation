package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithSpeedAndCourse_ReturnsDecodedPosition {

    @Test
    public void decodeWithSpeedAndCourse_ReturnsDecodedPosition() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(GalileoProtocol.class);
        Position position = new Position(1.0, 2.0, 3.0);
        Object decodedMessage = decoder.decode(null, null, "{\"speed\":" + position.getSpeed() + "\",\"course\":" + position.getCourse() + "}");
        assertNotNull(decodedMessage);
    }

}