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

public class GeneratedTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test", new BtProtocol()));

    @Test
    public void decodeTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01); //HEADER_POSITIONS
        buf.writeShortLE(12);

        Method decode = GalileoProtocolDecoder.class.getDeclaredMethod("decode", Channel.class, Object.class);
        decode.setAccessible(true);

        List<Position> result = (List<Position>) decode.invoke(decoder, channel, buf);
        assertEquals(null, result);
    }

    @Test
    public void decodeCompressedPositionsTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(0);

        Method decodedCompressedPositions = GalileoProtocolDecoder.class.getDeclaredMethod("decodeCompressedPositions", Channel.class, Object.class);
        decodedCompressedPositions.setAccessible(true);

        List<Position> result = (List<Position>) decodedCompressedPositions.invoke(decoder, channel, buf);
        assertEquals(null, result);
    }

    @Test
    public void decodeIridiumPositionTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(0);
        buf.skipBytes(3);

        Method decodeIridiumPosition = GalileoProtocolDecoder.class.getDeclaredMethod("decodeIridiumPosition", Channel.class, Object.class);
        decodeIridiumPosition.setAccessible(true);

        Position result = (Position) decodeIridiumPosition.invoke(decoder, channel, buf);
        assertEquals(null, result);
    }

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