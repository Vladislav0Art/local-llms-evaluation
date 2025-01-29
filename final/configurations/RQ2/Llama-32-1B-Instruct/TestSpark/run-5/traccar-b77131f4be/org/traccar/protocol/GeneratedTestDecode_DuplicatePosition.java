package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_DuplicatePosition {

    @Test
    public void testDecode_DuplicatePosition() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01, 0x02, 0x03};
        Position position = new Position(10.5f, 20.7f, Calendar.getInstance().getTime());
        Map<String, Object> networkMessage = new HashMap<>();
        networkMessage.put("position", position);
        NetworkMessage msg = new NetworkMessage(data, networkMessage);

        // Act
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        // Assert
        assertEquals("Duplicate Position", decoder.decode(msg));
    }

}