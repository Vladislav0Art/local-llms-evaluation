package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithInvalidData_ThrowsException {

    @Test
    public void decodeWithInvalidData_ThrowsException() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(GalileoProtocol.class);
        assertThrows(Exception.class, () -> decoder.decode(null, null, "{\"invalid\":\"data\"}"));
    }

}