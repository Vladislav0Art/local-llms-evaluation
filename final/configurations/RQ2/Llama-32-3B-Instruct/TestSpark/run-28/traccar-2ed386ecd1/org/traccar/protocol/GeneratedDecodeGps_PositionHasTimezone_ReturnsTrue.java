package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import io.netty.buffer.ByteBuf;

public class GeneratedDecodeGps_PositionHasTimezone_ReturnsTrue {

    @Test
    public void decodeGps_PositionHasTimezone_ReturnsTrue() {
        Position position = new Position(10.0, -122.0, 100.0, Calendar.getInstance().getTime(), "US/Pacific");
        ByteBuf buf = Unpooled.copiedBuffer("1", StandardCharsets.US_ASCII);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, null);
        assertTrue(result);
    }

}