package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_DifferentDataType {

    @Test
    public void testDecode_DifferentDataType() {
        // Arrange
        byte[] data1 = new byte[]{0x00, 0x01};
        byte[] data2 = new byte[]{0x02, 0x03};

        // Act and Assert
        try {
            decoder.decode(new Channel(), SocketAddress.empty(), null);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Different DataType", e.getMessage());
        }
    }

}