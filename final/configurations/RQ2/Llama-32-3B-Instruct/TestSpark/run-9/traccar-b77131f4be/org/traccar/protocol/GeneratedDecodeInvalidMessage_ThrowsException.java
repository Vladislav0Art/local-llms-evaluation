package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeInvalidMessage_ThrowsException {

    @Test
    public void decodeInvalidMessage_ThrowsException() throws Exception {
        Position position = new Position(1.0, 2.0, 3.0);
        Protocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertThrows(Exception.class, () -> decoder.decode(null, null, "invalid message"));
    }

}