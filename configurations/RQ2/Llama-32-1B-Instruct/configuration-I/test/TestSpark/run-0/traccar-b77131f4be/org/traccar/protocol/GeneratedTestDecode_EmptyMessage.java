package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_EmptyMessage {

    @Test
    public void testDecode_EmptyMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

}