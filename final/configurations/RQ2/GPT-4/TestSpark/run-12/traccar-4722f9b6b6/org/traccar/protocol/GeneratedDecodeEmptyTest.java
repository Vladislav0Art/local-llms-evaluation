package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeEmptyTest {


    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeEmptyTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "";

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}