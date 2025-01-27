package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeGps_Position_WithMultipleSatellites_ReturnsCorrectedPosition {

    @Test
    public void decodeGps_Position_WithMultipleSatellites_ReturnsCorrectedPosition() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(8);
        buf.writeByte(0x01); // data1
        buf.writeByte(0x02); // data2
        buf.writeByte(0x03); // data3
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null));
    }

}