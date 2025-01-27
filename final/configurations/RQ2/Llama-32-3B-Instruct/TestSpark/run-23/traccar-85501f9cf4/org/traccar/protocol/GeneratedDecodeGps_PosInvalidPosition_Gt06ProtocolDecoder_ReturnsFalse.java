package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGps_PosInvalidPosition_Gt06ProtocolDecoder_ReturnsFalse {

    @Test
    public void DecodeGps_PosInvalidPosition_Gt06ProtocolDecoder_ReturnsFalse() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position("lat", "lon");
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null));
    }

}