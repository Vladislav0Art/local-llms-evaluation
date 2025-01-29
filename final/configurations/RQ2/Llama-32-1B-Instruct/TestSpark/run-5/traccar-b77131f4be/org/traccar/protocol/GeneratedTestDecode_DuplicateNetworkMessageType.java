package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_DuplicateNetworkMessageType {

    @Test
    public void testDecode_DuplicateNetworkMessageType() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01};
        NetworkMessage msg1 = new NetworkMessage(data);
        NetworkMessage msg2 = new NetworkMessage(data);

        // Act and Assert
        AssertionError exception = assertThrows(io.netty.buffer.ByteBufUtil.InvalidByteBufException.class, () -> decoder.decode(msg2));
        assertEquals("Duplicate NetworkMessageType", exception.getMessage());
    }

}