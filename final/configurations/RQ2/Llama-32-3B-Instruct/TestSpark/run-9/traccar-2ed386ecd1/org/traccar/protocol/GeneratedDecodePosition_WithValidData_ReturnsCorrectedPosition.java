package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodePosition_WithValidData_ReturnsCorrectedPosition {

    @Test
    public void decodePosition_WithValidData_ReturnsCorrectedPosition() {
        ByteBuf buf = Unpooled.buffer(4);
        buf.writeByte(0x01); // data1
        buf.writeByte(0x02); // data2
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), buf, true, false, false, null));
    }

}