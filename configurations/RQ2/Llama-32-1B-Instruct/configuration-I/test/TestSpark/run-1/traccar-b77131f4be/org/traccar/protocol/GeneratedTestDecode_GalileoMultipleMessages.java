package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoMultipleMessages {

    @Test
    public void testDecode_GalileoMultipleMessages() throws Exception {
        // Arrange
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress1 = Mockito.mock(SocketAddress.class);
        SocketAddress remoteAddress2 = Mockito.mock(SocketAddress.class);
        Object msg1 = "Hello, World!".getBytes();
        Object msg2 = "Hi, There!".getBytes();

        // Act
        byte[][] decodedMsgs = new GalileoProtocolDecoder().decode(channel, remoteAddress1, msg1);
        byte[][] decodedMsgs2 = new GalileoProtocolDecoder().decode(channel, remoteAddress2, msg2);

        // Assert
        assertEquals(2, getNumBytes(decodedMsgs));
        assertEquals(3, getNumBytes(decodedMsgs2));
        verify(msgs).equals(msg1);
        verify(msgs).equals(msg2);
    }

}