package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"message"};
        NetworkMessage networkMessage = new NetworkMessage();
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.3", args, address, networkMessage);

        // Assert
        assertEquals(networkMessage, (NetworkMessage) result);
    }

}