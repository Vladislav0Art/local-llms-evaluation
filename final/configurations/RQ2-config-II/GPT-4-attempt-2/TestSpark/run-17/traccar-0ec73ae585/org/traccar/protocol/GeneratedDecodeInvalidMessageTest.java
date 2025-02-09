package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.InetSocketAddress;

public class GeneratedDecodeInvalidMessageTest {

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder watchDecoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("192.168.1.1", 8080);
        Object msg = null;

        watchDecoder.decode(channel, remoteAddress, msg);
    }

}