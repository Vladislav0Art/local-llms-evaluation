package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoProtocolDecodedMessageLength {

    @Test
    public void testDecode_GalileoProtocolDecodedMessageLength() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        when(decoder.decode(null, null, Mockito.any(Object.class))).thenReturn("hello");
        try (Channel channel = Mockito.mock(Channel.class)) {
            SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
            Object msg = Mockito.mock(Object.class);
            String decodedMessage = decoder.decode(channel, remoteAddress, msg);
            Assert.assertNotNull(decodedMessage);
        }
    }

}