package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_withTimezone_test {

    @Test
    public void decodeGps_withTimezone_test() {
        Map<String, Object> result = Gt06ProtocolDecoder.decodeGps(new Position("lat", "lon"), null, false, false, false, new TimeZone("UTC"));
        assertNotNull(result);
        assertEquals("UTC", (String) result.get("timezone"));
    }

}