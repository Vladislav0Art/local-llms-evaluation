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

public class GeneratedDecodeSingleTagTest {

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

}