package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_InvalidData {

    @Test
    public void testDecode_InvalidData() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04};
        NetworkMessage msg = new NetworkMessage(data);

        // Act and Assert
        AssertionError exception = assertThrows(io.netty.buffer.ByteBufUtil.InvalidByteBufException.class, () -> decoder.decode(msg));
        assertEquals("Invalid ByteBuf", exception.getMessage());
    }

}