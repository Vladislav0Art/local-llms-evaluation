package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeTest() throws Exception {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new Object();
        Assert.assertNotNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}