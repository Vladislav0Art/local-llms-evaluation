package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode_GalileoProtocol_HasNoMessage {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_HasNoMessage() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        // Act
        Object result = decode(channel, remoteAddress, null);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

}