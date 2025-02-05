package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.Channel;
import org.traccar.Protocol;

import java.net.SocketAddress;

public class GeneratedDecodeNullTest {

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        Assert.assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}