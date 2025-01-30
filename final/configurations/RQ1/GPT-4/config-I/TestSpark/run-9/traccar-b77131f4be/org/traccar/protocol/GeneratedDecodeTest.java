package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

import java.net.SocketAddress;
import java.util.List;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.lang.reflect.Method;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        byte[] data = {0x01, 0x00, 0x19, 0x00, 0x00, 0x01, 0x00, 0x1c, 0x01, 0x00, 0x00,
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-',
                'A', 'B', 'C', 'D', 'E', 'F', '0', '1'};
        ByteBuf buf = Unpooled.copiedBuffer(data);

        ChannelHandlerContext ctx = Mockito.mock(ChannelHandlerContext.class);
        Mockito.when(ctx.channel()).thenReturn(Mockito.mock(Channel.class));

        List<Position> positions = (List<Position>) decoder.decode(ctx, remoteAddress, buf);
        Assert.assertTrue(positions.isEmpty());
    }

}