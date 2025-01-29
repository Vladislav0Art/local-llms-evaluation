package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.traccar.protocol.GalileoProtocolDecoder;

public class GeneratedTestDecode_DifferentMessageClass {

    @Test
    public void testDecode_DifferentMessageClass() {
        // Arrange
        byte[] data = new byte[]{0x00, 0x01};
        Object msg1 = new Object();
        Object msg2 = new String("Hello");

        // Act and Assert
        try {
            decoder.decode(new Channel(), SocketAddress.empty(), msg1);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Different MessageClass", e.getMessage());
        }
    }

}