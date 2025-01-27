package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_withSatellites_test {

    @Test
    public void decodeGps_withSatellites_test() {
        Map<String, Object> result = Gt06ProtocolDecoder.decodeGps(new Position("lat", "lon"), null, false, true);
        assertNotNull(result);
        assertTrue((Boolean) result.get("hasSatellites"));
    }

}