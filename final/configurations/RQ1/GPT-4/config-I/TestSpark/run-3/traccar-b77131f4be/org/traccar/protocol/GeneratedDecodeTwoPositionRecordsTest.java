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

public class GeneratedDecodeTwoPositionRecordsTest {

    @Test
    public void decodeTwoPositionRecordsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();

        // Record 1
        buf.writeByte(1);
        buf.writeShortLE(14);
        buf.writeByte(3);
        buf.writeCharSequence("123456789012345", java.nio.charset.StandardCharsets.US_ASCII);
        buf.writeByte(30);
        buf.writeByte(0);
        buf.writeIntLE(6010000);
        buf.writeIntLE(-9010000);
        buf.writeByte(32);
        buf.writeIntLE(946684820);

        // Record 2
        buf.writeByte(1);
        buf.writeShortLE(10);
        buf.writeByte(3);
        buf.writeByte(0);
        buf.writeIntLE(6015000);
        buf.writeIntLE(-9015000);
        buf.writeByte(20);
        buf.writeIntLE(946684830);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mock(Protocol.class));

        List<Position> positions = (LinkedList<Position>) decoder.decode(null, null, buf);

        Position p1 = positions.get(0);
        Position p2 = positions.get(1);

        Assert.assertEquals(p1.getLatitude(), 60.1, 1e-6);
        Assert.assertEquals(p1.getLongitude(), -90.1, 1e-6);
        Assert.assertEquals(p1.getDeviceTime().getTime(), 946684820000L);

        Assert.assertEquals(p2.getLatitude(), 60.15, 1e-6);
        Assert.assertEquals(p2.getLongitude(), -90.15, 1e-6);
        Assert.assertEquals(p2.getDeviceTime().getTime(), 946684830000L);
    }

}