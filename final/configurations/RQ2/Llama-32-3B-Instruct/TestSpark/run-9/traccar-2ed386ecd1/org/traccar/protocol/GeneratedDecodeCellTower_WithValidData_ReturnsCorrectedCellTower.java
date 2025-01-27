package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeCellTower_WithValidData_ReturnsCorrectedCellTower {

    @Test
    public void decodeCellTower_WithValidData_ReturnsCorrectedCellTower() {
        ByteBuf buf = Unpooled.buffer(2);
        buf.writeByte(0x01); // data1
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), buf, true, false, false, null));
    }

}