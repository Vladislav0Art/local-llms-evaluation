package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_NoRemoteAddress {

    @Test
    public void testDecode_NoRemoteAddress() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = null;
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

}