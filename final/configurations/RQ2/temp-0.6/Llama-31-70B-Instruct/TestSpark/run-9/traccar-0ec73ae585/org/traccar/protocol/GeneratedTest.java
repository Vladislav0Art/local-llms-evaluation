package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getHasIndexTest() {
        Assert.assertTrue(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Assert.assertNotNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        Object msg = new Object();
        Assert.assertNotNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}