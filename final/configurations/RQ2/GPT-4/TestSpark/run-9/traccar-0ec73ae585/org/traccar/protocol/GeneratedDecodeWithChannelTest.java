package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocol;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedDecodeWithChannelTest {

    @Test
    public void decodeWithChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol("watch"));

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 0));

        assertNotNull(decoder.decode(channel, new InetSocketAddress("localhost", 0), "test message"));
    }

}