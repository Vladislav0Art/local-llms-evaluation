package org.traccar.protocol;

import org.junit.Test;

import java.net.InetSocketAddress;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

public class GeneratedDecodeInvalidMessageTest {

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = null;
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 5007);
        Object msg = new Date();

        decoder.decode(channel, remoteAddress, msg);
    }

}