package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_GarlicMessage {

    @Test
    public void testDecode_GarlicMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

}