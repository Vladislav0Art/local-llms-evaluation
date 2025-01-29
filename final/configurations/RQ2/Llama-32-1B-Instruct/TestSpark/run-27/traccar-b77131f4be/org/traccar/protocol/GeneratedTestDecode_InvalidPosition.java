package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecode_InvalidPosition {

    @Test
    public void testDecode_InvalidPosition() throws Exception {
        // Arrange
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = mock(DeviceSession.class);
        Position position = new Position(-1, -122.4194, 2015);

        // Act
        Object result = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNull(result);
    }

}