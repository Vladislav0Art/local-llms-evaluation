package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecode_WithValidMessage_ReturnsCorrectDecodedMap {

    @Test
    public void Decode_WithValidMessage_ReturnsCorrectDecodedMap() throws Exception {
        // Arrange
        Map<String, Object> map = new HashMap<>();
        map.put("position", new Position(12.34, 56.78));
        byte[] bytes = "valid message".getBytes(StandardCharsets.UTF_8);
        public GalileoProtocolDecoder decoder = new GalileoProtocolDecoder();

        // Act
        Object decodedMessage = (GalileoProtocolDecoder) decoder.decode(null, null, bytes);
        if (decodedMessage instanceof Map) {
            assertEquals(map, (Map<String, Object>) decodedMessage);
        } else {
            throw new RuntimeException("Message was not decoded correctly");
        }
    }

}