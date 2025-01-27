package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_withSpeed_test {

    @Test
    public void decodeGps_withSpeed_test() {
        Map<String, Object> result = Gt06ProtocolDecoder.decodeGps(new Position("lat", "lon"), null, false, false, true);
        assertNotNull(result);
        assertTrue((Boolean) result.get("hasSpeed"));
    }

}