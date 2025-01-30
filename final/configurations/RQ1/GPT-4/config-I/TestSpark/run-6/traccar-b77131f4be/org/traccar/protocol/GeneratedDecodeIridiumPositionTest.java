package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Model;
import org.traccar.ProtocolTest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        ByteBuf buf = Unpooled.buffer();

        buf.writeByte(0x01);
        buf.writeShortLE(73);
        buf.writeIntLE(0x01001c);
        buf.writeIntLE(0);
        buf.writeBytes("IDENTITY123456789".getBytes());

        assertEquals(0x01, buf.readUnsignedByte());

        Position position = (Position) decoder.decode(null, null, buf);
        assertEquals(position.getDeviceId(), 0L);
    }

}