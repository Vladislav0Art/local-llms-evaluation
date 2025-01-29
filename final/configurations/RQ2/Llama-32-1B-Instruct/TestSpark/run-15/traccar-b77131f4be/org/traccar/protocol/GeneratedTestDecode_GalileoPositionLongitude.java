package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoPositionLongitude {

    @Test
    public void testDecode_GalileoPositionLongitude() {
        // Arrange
        Position position = new Position();
        positionLongitude = 122.4194;
        Mockito.when(Position.encode()).thenReturn(position.toString());

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