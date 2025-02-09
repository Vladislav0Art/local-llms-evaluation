package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.InetSocketAddress;

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() throws Exception {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder watchDecoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("192.168.1.1", 8080);
        Object msg = Unpooled.copiedBuffer("testmessage".getBytes());

        Object result = watchDecoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}