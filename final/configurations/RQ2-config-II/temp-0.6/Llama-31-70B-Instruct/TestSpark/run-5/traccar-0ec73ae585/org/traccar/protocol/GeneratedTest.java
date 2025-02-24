package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setUp() {
        watchProtocolDecoder = new WatchProtocolDecoder();
    }

    @Test
    public void testDecode() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new Object();

        Object response = watchProtocolDecoder.decode(channel, remoteAddress, msg);

        Assert.assertNotNull(response);
    }

}