package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Device;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("Test Protocol"));

    @Test
    public void decodeTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.wrappedBuffer("test_data".getBytes(StandardCharsets.US_ASCII));

        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);

        Assert.assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}