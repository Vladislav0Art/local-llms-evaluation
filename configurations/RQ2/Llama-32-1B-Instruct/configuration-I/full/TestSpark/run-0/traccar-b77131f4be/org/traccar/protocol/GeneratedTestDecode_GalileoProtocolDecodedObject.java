package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoProtocolDecodedObject {

    @Test
    public void testDecode_GalileoProtocolDecodedObject() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        when(decoder.decode(channel, remoteAddress, msg)).thenReturn(new Object());
        try (Channel channel = Mockito.mock(Channel.class)) {
            SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
            Object msg = Mockito.mock(Object.class);
            Object decodedObject = decoder.decode(channel, remoteAddress, msg);
            Assert.assertNotNull(decodedObject);
        }
    }

}