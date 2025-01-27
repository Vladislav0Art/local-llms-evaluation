package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGps_MultipleValidPositions_Gt06ProtocolDecoder_CorrectlyDecodesMultiple {

    @Test
    public void DecodeGps_MultipleValidPositions_Gt06ProtocolDecoder_CorrectlyDecodesMultiple() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position1 = new Position("lat", "lon");
        Position position2 = new Position("lat2", "lon2");
        assertTrue(Gt06ProtocolDecoder.decodeGps(position1, buf, true, false, false, null)
                && Gt06ProtocolDecoder.decodeGps(position2, buf, true, false, false, null));
    }

}