package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode_NoObject {

    @Test
    public void testDecode_NoObject() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "Hello";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

}