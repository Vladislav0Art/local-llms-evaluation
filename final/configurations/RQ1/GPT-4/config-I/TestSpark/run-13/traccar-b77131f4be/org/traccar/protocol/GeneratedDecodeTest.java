package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);

        ByteBuf buf = Unpooled.buffer();
        buf.writeIntLE(1);
        buf.writeIntLE(1);
        buf.writeIntLE(0);
        buf.writeIntLE(1);

        Method decodeMinimalDataSet = GalileoProtocolDecoder.class.getDeclaredMethod("decodeMinimalDataSet", Position.class, ByteBuf.class);
        decodeMinimalDataSet.setAccessible(true);

        Position position = new Position();
        decodeMinimalDataSet.invoke(decoder, position, buf);

        Assert.assertNotNull(position.getLatitude());
        Assert.assertNotNull(position.getLongitude());
        Assert.assertNotNull(position.getFixTime());
        Assert.assertTrue(position.getValid());
    }

}