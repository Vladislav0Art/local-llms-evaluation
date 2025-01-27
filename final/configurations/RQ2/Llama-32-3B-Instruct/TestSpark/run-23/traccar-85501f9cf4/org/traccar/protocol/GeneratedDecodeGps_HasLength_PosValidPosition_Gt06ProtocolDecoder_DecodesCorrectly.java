package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGps_HasLength_PosValidPosition_Gt06ProtocolDecoder_DecodesCorrectly {

    @Test
    public void DecodeGps_HasLength_PosValidPosition_Gt06ProtocolDecoder_DecodesCorrectly() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position("lat", "lon");
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null));
    }

}