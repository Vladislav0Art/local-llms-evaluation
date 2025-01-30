package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.lang.reflect.Method;
import java.util.Date;

import static org.mockito.Mockito.*;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);

        ByteBuf buf = Unpooled.buffer();
        buf.clear();
        buf.writeByte(0x01);

        Method decodePositions = GalileoProtocolDecoder.class.getDeclaredMethod("decodePositions", Channel.class, SocketAddress.class, ByteBuf.class);
        decodePositions.setAccessible(true);
        List<Position> positions = (List<Position>) decodePositions.invoke(decoder, null, null, buf);
        Assert.assertEquals(0, positions.size());
    }

}