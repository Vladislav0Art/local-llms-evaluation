package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeSpeed_WithValidData_ReturnsCorrectedSpeed {

    @Test
    public void decodeSpeed_WithValidData_ReturnsCorrectedSpeed() {
        ByteBuf buf = Unpooled.buffer(2);
        buf.writeByte(0x01); // data1
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), buf, true, false, true, null));
    }

}