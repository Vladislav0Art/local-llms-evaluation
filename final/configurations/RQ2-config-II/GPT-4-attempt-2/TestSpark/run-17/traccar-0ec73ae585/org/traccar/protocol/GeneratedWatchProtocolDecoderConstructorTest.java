package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;

import java.net.InetSocketAddress;

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder watchDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchDecoder);
    }

}