package org.traccar.protocol;

import org.junit.Test;
import org.traccar.network.DataProtocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionWithMinimalDataSetTest {

    @Test
    public void decodePositionWithMinimalDataSetTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01); // header
        buf.writeShortLE(15); // length
        buf.writeBytes(new byte[]{0x00, 0x00, 0x01, 0x0C}); // identification header
        buf.writeIntLE(1); // index
        buf.writeBytes("1234567890ABCDE".getBytes(StandardCharsets.US_ASCII)); // unique id

        Position position = decoder.decode(null, mock(SocketAddress.class), buf);
        assertNotNull(position);
        assertEquals(Position.KEY_ALARM, Position.ALARM_GENERAL);
        assertTrue(position.getValid());
    }

}