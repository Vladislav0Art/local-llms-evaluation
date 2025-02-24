package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}