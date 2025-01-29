package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeChannel {

    @Test
    public void testDecodeChannel() throws Exception {
        // Arrange
        Protocol protocol = Mockito.mock(Protocol.class);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        ByteBuf msg;
        Object result;

        try {
            msg = decoder.decode(channel, remoteAddress, null);
            result = decoder.getHasIndex();
        } finally {
            Mockito.verify(channel).close();
        }

        // Assert
        assertTrue(result instanceof ByteBuf);
    }

}