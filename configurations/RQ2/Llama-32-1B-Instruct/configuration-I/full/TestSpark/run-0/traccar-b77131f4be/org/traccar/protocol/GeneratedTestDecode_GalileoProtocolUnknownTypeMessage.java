package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoProtocolUnknownTypeMessage {

    @Test
    public void testDecode_GalileoProtocolUnknownTypeMessage() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        when(decoder.decode(null, null, Mockito.any(Object.class))).thenReturn(new Object());
        try (Channel channel = Mockito.mock(Channel.class)) {
            SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
            Object msg = Mockito.mock(Object.class);
            Object decodedObject = decoder.decode(channel, remoteAddress, msg);
            Assert.assertNotNull(decodedObject);
        }
    }

}