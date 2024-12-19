package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_NoChannel {

    @Test
    public void testDecode_NoChannel() throws Exception {
        Channel channel = null;
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(remoteAddress, "", msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

}