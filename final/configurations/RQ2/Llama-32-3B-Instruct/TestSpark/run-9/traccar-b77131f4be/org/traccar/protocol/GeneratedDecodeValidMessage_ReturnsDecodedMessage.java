package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeValidMessage_ReturnsDecodedMessage {

    @Test
    public void decodeValidMessage_ReturnsDecodedMessage() throws Exception {
        Position position = new Position(1.0, 2.0, 3.0);
        Protocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object decodedMessage = decoder.decode(null, null, "position=" + position);
        assertNotNull(decodedMessage);
    }

}