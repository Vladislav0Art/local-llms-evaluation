package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDecodeGpsPositionInvalid {

    @Test
    public void testDecodeGpsPositionInvalid() {
        Position position = new Position();
        byte[] buf = Unpooled.copiedBuffer("0123456789abcdef", StandardCharsets.UTF_8);
        boolean hasLength = true;
        TimeZone timezone = Calendar.getInstance().getTimeZone();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, false, false, timezone));
    }

}