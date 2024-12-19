package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_EmptyMessageGarlic {

    @Test
    public void testDecode_EmptyMessageGarlic() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

}