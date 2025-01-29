package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoPosition {

    @Test
    public void testDecode_GalileoPosition() {
        // Arrange
        Position position = new Position();
        Mockito.when(Position.encode()).thenReturn("Galileo");

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