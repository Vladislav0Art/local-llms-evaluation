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

public class GeneratedDecodeCompressedPositionsTest {

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test", new BtProtocol()));

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

}