package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDecodeGpsPositionHasLength {

    @Test
    public void testDecodeGpsPositionHasLength() {
        Position position = new Position();
        byte[] buf = Unpooled.copiedBuffer("0123456789abcdef", StandardCharsets.UTF_8);
        boolean hasLength = true;
        TimeZone timezone = Calendar.getInstance().getTimeZone();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}