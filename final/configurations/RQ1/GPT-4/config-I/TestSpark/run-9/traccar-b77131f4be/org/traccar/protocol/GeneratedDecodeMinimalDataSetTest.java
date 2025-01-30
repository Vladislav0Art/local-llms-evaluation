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

public class GeneratedDecodeMinimalDataSetTest {

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

}