package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeSocketAddress {

    @Test
    public void testDecodeSocketAddress() throws Exception {
        // Arrange
        Protocol protocol = Mockito.mock(Protocol.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        ByteBuf msg;
        Object result;

        try {
            msg = decoder.decode(null, remoteAddress, null);
            result = decoder.getHasIndex();
        } finally {
            Mockito.verify(remoteAddress).close();
        }

        // Assert
        assertTrue(result instanceof ByteBuf);
    }

}