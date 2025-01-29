package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoDeviceSession {

    @Test
    public void testDecode_GalileoDeviceSession() {
        // Arrange
        DeviceSession deviceSession = new DeviceSession();
        Mockito.when(DeviceSession.encode()).thenReturn("Galileo");

        // Act
        Object msg = decoder.decode(
                Mockito.mock(Channel.class),
                Mockito.mock(SocketAddress.class),
                Mockito.mock(NetworkMessage.class)
        );

        // Assert
        assertEquals("Galileo", (String) msg);
    }

}