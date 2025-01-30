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

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);

        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x08, 0x00, 0x1c, 0x00, 0x08, 0x00, 0x0a, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x30, 0x30,
                0x08, 0x00, 0x0a, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00});

        Method decodeCompressedPositions = GalileoProtocolDecoder.class.getDeclaredMethod("decodeCompressedPositions", Channel.class, SocketAddress.class, ByteBuf.class);
        decodeCompressedPositions.setAccessible(true);

        List<Position> positions = (List<Position>) decodeCompressedPositions.invoke(decoder, null, null, buf);
        Assert.assertNotNull(positions);
        Assert.assertEquals(1, positions.size());
        Assert.assertTrue(positions.get(0).getValid());
    }

}