package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import io.netty.buffer.ByteBuf;

public class GeneratedDecodeGps_PositionIsEmpty_ReturnsFalse {

    @Test
    public void decodeGps_PositionIsEmpty_ReturnsFalse() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("1", StandardCharsets.US_ASCII);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, null);
        assertFalse(result);
    }

}