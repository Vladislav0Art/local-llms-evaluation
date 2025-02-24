package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Object();

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}