package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedTest {

    private ChannelFuture channelFuture;
    private ChannelHandlerContext channelContext;

    @Test
    public void testDecode() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mock(Protocol.class));

        Date currentTime = new Date();
        Position position = new Position();
        position.setTime(currentTime);
        position.setDeviceId(1);

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.copiedBuffer("abc".getBytes(StandardCharsets.US_ASCII));
        NetworkMessage msg = new NetworkMessage(buf, channel, remoteAddress);

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}