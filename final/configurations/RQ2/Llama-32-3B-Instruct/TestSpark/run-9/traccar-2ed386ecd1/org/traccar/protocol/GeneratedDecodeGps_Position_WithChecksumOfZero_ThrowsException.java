package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeGps_Position_WithChecksumOfZero_ThrowsException {

    @Test
    public void decodeGps_Position_WithChecksumOfZero_ThrowsException() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(4);
        buf.writeByte(0x00); // checksum
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null));
    }

}