package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class GeneratedTestDecodeGps_position {

    @Test
    public void testDecodeGps_position() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Map<String, Object> result = decoder.decodeGps(null, null, false, null);
        assertNotNull(result);
    }

}