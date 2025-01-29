package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecode_SinglePosition {

    @Test
    public void testDecode_SinglePosition() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = mock(DeviceSession.class);
        Position position = new Position(37.7749, -122.4194, 2015);

        // Act
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertTrue(result instanceof NetworkMessage);
        NetworkMessage networkMessage = (NetworkMessage) result;
        assertNotNull(networkMessage.getPayload());
        assertEquals(position, networkMessage.getPosition());
    }

}