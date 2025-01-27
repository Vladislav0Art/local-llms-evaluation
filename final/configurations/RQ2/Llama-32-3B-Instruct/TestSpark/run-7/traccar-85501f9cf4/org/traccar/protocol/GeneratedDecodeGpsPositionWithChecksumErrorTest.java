package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

import java.nio.ByteBuffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGpsPositionWithChecksumErrorTest {

    @Test
    public void decodeGpsPositionWithChecksumErrorTest() {
        Position position = new Position();
        byte[] data = new byte[]{0x01, 0x02, 0x03};
        ByteBuf buf = Unpooled.copiedBuffer(data);
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Checksum checksum = new Checksum();
        assertFalse(checksum.verify(data));
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}