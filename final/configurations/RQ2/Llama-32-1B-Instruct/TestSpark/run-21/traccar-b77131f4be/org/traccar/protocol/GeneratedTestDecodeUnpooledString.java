package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeUnpooledString {

    @Test
    public void testDecodeUnpooledString() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"string"};
        Unpooled unpooled = new Unpooled();
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.10", args, address, unpooled);

        // Assert
        assertEquals(unpooled.toString(), (String) result);
    }

}