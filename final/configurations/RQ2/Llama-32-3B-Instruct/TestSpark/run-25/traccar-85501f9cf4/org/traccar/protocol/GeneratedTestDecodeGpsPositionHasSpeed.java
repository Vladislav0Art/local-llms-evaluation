package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDecodeGpsPositionHasSpeed {

    @Test
    public void testDecodeGpsPositionHasSpeed() {
        Position position = new Position();
        byte[] buf = Unpooled.copiedBuffer("0123456789abcdef", StandardCharsets.UTF_8);
        boolean hasLength = true;
        boolean hasSpeed = true;
        TimeZone timezone = Calendar.getInstance().getTimeZone();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, hasSpeed, false, timezone));
    }

}