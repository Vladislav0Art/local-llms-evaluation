package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_NetworkMessage {

    @Test
    public void testDecode_NetworkMessage() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01, 0x02, 0x03};
        NetworkMessage msg = new NetworkMessage(data);

        // Act
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        // Assert
        assertEquals("NetworkMessage", decoder.decode(msg));
    }

}