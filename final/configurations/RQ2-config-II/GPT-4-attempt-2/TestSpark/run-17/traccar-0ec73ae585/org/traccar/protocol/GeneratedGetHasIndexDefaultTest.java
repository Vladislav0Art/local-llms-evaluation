package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.InetSocketAddress;

public class GeneratedGetHasIndexDefaultTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder watchDecoder = new WatchProtocolDecoder(protocol);
        boolean result = watchDecoder.getHasIndex();
        assertFalse(result);
    }

}