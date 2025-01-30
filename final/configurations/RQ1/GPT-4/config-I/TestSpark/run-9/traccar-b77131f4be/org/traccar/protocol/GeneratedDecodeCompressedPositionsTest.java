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

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        byte[] data = {0x02, 0x00, 0x5d, 0x1a, 0x17, 0x19, 0x06, 0x04, 0x1d, 0x40, 0x0, 0x5d,
                0x1a, 0x17, 0x19, 0x06, 0x03, 0x3d, 0xa1, 0x0, 0x44, 0x11};
        ByteBuf buf = Unpooled.copiedBuffer(data);

        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Method getDeviceSessionMethod = GalileoProtocolDecoder.class.getDeclaredMethod("getDeviceSession", Channel.class, SocketAddress.class);
        getDeviceSessionMethod.setAccessible(true);
        DeviceSession deviceSession = (DeviceSession) getDeviceSessionMethod.invoke(decoder, null, remoteAddress);

        ChannelHandlerContext ctx = Mockito.mock(ChannelHandlerContext.class);
        Mockito.when(ctx.channel()).thenReturn(Mockito.mock(Channel.class));

        List<Position> positions = (List<Position>) decoder.decode(ctx, remoteAddress, buf);
        Assert.assertTrue(positions.isEmpty());
    }

}