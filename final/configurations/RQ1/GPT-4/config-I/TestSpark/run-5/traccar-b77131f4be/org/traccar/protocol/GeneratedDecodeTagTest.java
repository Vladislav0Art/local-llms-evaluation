package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTagTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test", new BtProtocol()));

    @Test
    public void decodeTagTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method decodeTag = GalileoProtocolDecoder.class.getDeclaredMethod("decodeTag", Position.class, ByteBuf.class, int.class);
        decodeTag.setAccessible(true);

        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(10);

        decodeTag.invoke(decoder, position, buf, 0x01);
        assertEquals(0, position.getAttributes().size());
        buf.writeByte(10);
        decodeTag.invoke(decoder, position, buf, 0xa0);
        assertEquals(1, position.getAttributes().size());
        buf.writeByte(10);
        decodeTag.invoke(decoder, position, buf, 0xb3);
        assertEquals(2, position.getAttributes().size());
    }

}