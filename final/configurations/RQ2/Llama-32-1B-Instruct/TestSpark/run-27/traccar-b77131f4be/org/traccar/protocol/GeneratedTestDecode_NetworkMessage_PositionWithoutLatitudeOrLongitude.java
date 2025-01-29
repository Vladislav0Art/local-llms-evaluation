package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecode_NetworkMessage_PositionWithoutLatitudeOrLongitude {

    @Test
    public void testDecode_NetworkMessage_PositionWithoutLatitudeOrLongitude() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = mock(DeviceSession.class);
        Position position = new Position(37.7749);

        // Act
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(position, (NetworkMessage) result);
    }

}