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

public class GeneratedTest {

    @Test
    public void decodeSingleTagTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position("galileo");
        byte[] data = {0x10, 0x01, 0x00};
        ByteBuf buf = Unpooled.copiedBuffer(data);

        Method decodeTag = GalileoProtocolDecoder.class.getDeclaredMethod("decodeTag", Position.class, ByteBuf.class, int.class);
        decodeTag.setAccessible(true);
        decodeTag.invoke(decoder, position, buf, 0x10);

        Assert.assertEquals(new Integer(1), position.getAttributes().get(Position.KEY_INDEX));
    }

    @Test
    public void decodeMultipleTagsTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position("galileo");
        byte[] data = {0x10, 0x01, 0x00, 0x01, 0x02};
        ByteBuf buf = Unpooled.copiedBuffer(data);

        Method decodeTag = GalileoProtocolDecoder.class.getDeclaredMethod("decodeTag", Position.class, ByteBuf.class, int.class);
        decodeTag.setAccessible(true);
        decodeTag.invoke(decoder, position, buf, 0x10);
        decodeTag.invoke(decoder, position, buf, 0x01);

        Assert.assertEquals(new Integer(1), position.getAttributes().get(Position.KEY_INDEX));
        Assert.assertEquals(new Integer(2), position.getAttributes().get(Position.KEY_VERSION_HW));
    }

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

    @Test
    public void decodeMinimalDataSetTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        byte[] bits = {89, 104, 95, 50, 24, (byte) 160, (byte) 131, (byte) 160, 64, 0};
        ByteBuf buf = Unpooled.copiedBuffer(bits);
        Position position = new Position();

        Method decodeMinimalDataSet = GalileoProtocolDecoder.class.getDeclaredMethod("decodeMinimalDataSet", Position.class, ByteBuf.class);
        decodeMinimalDataSet.setAccessible(true);
        decodeMinimalDataSet.invoke(decoder, position, buf);

        Assert.assertTrue(position.getValid());
        Assert.assertEquals(2.5, position.getLongitude(), 0.01);
        Assert.assertEquals(50, position.getLatitude(), 0.01);
        Assert.assertFalse(position.getAttributes().containsKey(Position.KEY_ALARM));
    }

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