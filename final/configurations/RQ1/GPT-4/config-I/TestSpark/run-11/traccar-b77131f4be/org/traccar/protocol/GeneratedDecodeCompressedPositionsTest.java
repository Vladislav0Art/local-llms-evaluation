package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeCompressedPositionsTest {

    @Mock
    private GalileoProtocolDecoder decoder;

    @Test
    public void decodeCompressedPositionsTest() {
        try {
            ByteBuf buf = Unpooled.buffer().writeByte(0x01);

            Method decodeCompressedPositions = GalileoProtocolDecoder.class.getDeclaredMethod(
                    "decodeCompressedPositions", Channel.class, SocketAddress.class, ByteBuf.class);
            decodeCompressedPositions.setAccessible(true);

            List<Position> positions = (List<Position>) decodeCompressedPositions.invoke(decoder, null, null, buf);

            Assert.assertNull(positions);
        } catch (Exception e) {
            Assert.fail("Invocation of decodeCompressedPositions method has thrown an error: " + e.getMessage());
        }
    }

}