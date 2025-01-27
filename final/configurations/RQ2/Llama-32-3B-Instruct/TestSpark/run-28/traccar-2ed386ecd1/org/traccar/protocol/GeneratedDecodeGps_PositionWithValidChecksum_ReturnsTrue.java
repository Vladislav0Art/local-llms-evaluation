package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import io.netty.buffer.ByteBuf;

public class GeneratedDecodeGps_PositionWithValidChecksum_ReturnsTrue {

    @Test
    public void decodeGps_PositionWithValidChecksum_ReturnsTrue() {
        Position position = new Position(10.0, -122.0, 100.0, Calendar.getInstance().getTime(), "US/Pacific");
        int checksum = Checksum.calculate(position, null);
        ByteBuf buf = Unpooled.copiedBuffer(String.format("%02x%02x%02x%02x", checksum >> 8, checksum & 0xff, checksum >> 16, checksum & 0xff), StandardCharsets.US_ASCII);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, null);
        assertTrue(result);
    }

}