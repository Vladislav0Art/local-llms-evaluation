package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecode_NetworkMessage {

    @Test
    public void testDecode_NetworkMessage() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = mock(DeviceSession.class);

        // Act
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(position, (NetworkMessage) result);
    }

}