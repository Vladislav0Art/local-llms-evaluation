package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecode_WithValidMessage_ReturnsCorrectDecodedMessage {

    @Test
    public void Decode_WithValidMessage_ReturnsCorrectDecodedMessage() throws Exception {
        // Arrange
        Map<String, Object> map = new HashMap<>();
        map.put("position", new Position(12.34, 56.78));
        Object message = "valid message";
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder();

        // Act
        Object decodedMessage = (GalileoProtocolDecoder) decoder.decode(null, null, message);
        if (decodedMessage instanceof Map) {
            assertEquals(map, (Map<String, Object>) decodedMessage);
        } else {
            throw new RuntimeException("Message was not decoded correctly");
        }
    }

}