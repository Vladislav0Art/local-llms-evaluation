package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.Protocol;

import java.util.LinkedList;
import java.util.List;
import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(1);
        buf.writeShortLE(10);
        buf.writeByte(3);
        buf.writeCharSequence("123456789012345", java.nio.charset.StandardCharsets.US_ASCII);
        buf.writeByte(30);
        buf.writeByte(0);
        buf.writeIntLE(6000000);
        buf.writeIntLE(-9000000);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mock(Protocol.class));

        List<Position> positions = (LinkedList<Position>) decoder.decode(null, null, buf);
        Position p = positions.get(0);

        Assert.assertEquals(p.getProtocol(), "Galileo");
        Assert.assertEquals(p.getLatitude(), 60., 1e-6);
        Assert.assertEquals(p.getLongitude(), -90., 1e-6);
    }

}