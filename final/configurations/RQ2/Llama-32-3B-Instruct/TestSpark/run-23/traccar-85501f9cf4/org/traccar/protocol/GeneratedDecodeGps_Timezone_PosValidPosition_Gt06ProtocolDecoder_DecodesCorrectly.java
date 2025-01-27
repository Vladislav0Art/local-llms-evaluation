package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGps_Timezone_PosValidPosition_Gt06ProtocolDecoder_DecodesCorrectly {

    @Test
    public void DecodeGps_Timezone_PosValidPosition_Gt06ProtocolDecoder_DecodesCorrectly() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position("lat", "lon");
        Calendar calendar = Calendar.getInstance();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, calendar));
    }

}