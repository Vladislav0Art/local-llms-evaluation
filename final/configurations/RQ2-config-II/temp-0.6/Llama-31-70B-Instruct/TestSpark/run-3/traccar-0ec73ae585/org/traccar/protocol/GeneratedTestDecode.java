package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTestDecode {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

    @Test
    public void testDecode() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}