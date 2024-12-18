package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoProtocolEmptyMessage {

    @Test
    public void testDecode_GalileoProtocolEmptyMessage() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        when(decoder.decode(channel, remoteAddress, Mockito.any(Object.class))).thenReturn(null);
        try (Channel channel = Mockito.mock(Channel.class)) {
            SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
            Object msg = Mockito.mock(Object.class);
            Object decodedObject = decoder.decode(channel, remoteAddress, msg);
            Assert.assertNotNull(decodedObject);
        }
    }

}