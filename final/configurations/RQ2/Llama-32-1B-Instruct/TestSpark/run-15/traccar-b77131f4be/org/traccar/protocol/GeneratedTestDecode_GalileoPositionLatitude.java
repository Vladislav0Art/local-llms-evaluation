package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoPositionLatitude {

    @Test
    public void testDecode_GalileoPositionLatitude() {
        // Arrange
        Position position = new Position();
        positionLatitude = 37.7749;
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