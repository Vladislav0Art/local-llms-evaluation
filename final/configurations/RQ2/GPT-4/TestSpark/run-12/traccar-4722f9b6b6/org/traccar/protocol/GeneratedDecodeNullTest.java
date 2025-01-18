package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeNullTest {


    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeNullTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = null;

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}