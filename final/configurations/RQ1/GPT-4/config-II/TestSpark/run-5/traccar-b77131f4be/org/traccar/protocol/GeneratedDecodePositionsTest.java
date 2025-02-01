package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeShortLE(0);
        buf.writeByte(0x03);
        buf.writeCharSequence("123456789012345", StandardCharsets.US_ASCII);
        buf.writeByte(0x30);
        buf.writeByte(0x00);
        buf.writeInt((int) 51.1e6);
        buf.writeInt((int) 4.1e6);
        buf.writeByte(0x20);
        buf.writeInt((int) (System.currentTimeMillis() / 1000));
        buf.writeByte(0x02);
        buf.writeShortLE(0);
        List<Position> positions = decoder.decodePositions(channel, remoteAddress, buf);
        Position position = positions.get(0);

        assertEquals(51.1, position.getLatitude(), 0.01);
        assertEquals(4.1, position.getLongitude(), 0.01);
    }

}