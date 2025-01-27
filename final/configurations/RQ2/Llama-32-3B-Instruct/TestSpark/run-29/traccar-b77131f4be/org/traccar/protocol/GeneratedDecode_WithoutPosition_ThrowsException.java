package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecode_WithoutPosition_ThrowsException {

    @Test
    public void Decode_WithoutPosition_ThrowsException() throws Exception {
        // Arrange
        byte[] bytes = "message without position".getBytes(StandardCharsets.UTF_8);
        public GalileoProtocolDecoder decoder = new GalileoProtocolDecoder();

        // Act
        try {
            decoder.decode(null, null, bytes);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}