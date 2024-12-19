package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoMessage {

    @Test
    public void testDecode_GalileoMessage() throws Exception {
        // Arrange
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = "Hello, World!".getBytes();

        // Act
        byte[] decodedMsg = new GalileoProtocolDecoder().decode(channel, remoteAddress, msg);

        // Assert
        assertEquals("Hello, World!", getByteArrayInputStream(decodedMsg));
    }

}