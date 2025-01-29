package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_DuplicateNetworkMessage {

    @Test
    public void testDecode_DuplicateNetworkMessage() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01, 0x02, 0x03};
        NetworkMessage msg1 = new NetworkMessage(data);
        NetworkMessage msg2 = new NetworkMessage(data);

        // Act and Assert
        AssertionError exception = assertThrows(io.netty.buffer.ByteBufUtil.InvalidByteBufException.class, () -> decoder.decode(msg2));
        assertEquals("Duplicate NetworkMessage", exception.getMessage());
    }

}