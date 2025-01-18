package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocol;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedDecodeInvalidMessageTest {

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol("watch"));

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        assertNull(decoder.decode(channel, new InetSocketAddress("localhost", 0), "invalid message"));
    }

}