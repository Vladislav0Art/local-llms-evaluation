package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeValidWithChannelTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeValidWithChannelTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        byte[] bytes = {10, 20, 30, 40, 50};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8000);

        Object obj = decoder.decode(channel, remoteAddress, buf);

        assertNotNull(obj);
    }

}