package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoNetworkMessage {

    @Test
    public void testDecode_GalileoNetworkMessage() {
        // Arrange
        NetworkMessage networkMessage = new NetworkMessage();
        Mockito.when(NetworkMessage.encode()).thenReturn("Galileo");

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