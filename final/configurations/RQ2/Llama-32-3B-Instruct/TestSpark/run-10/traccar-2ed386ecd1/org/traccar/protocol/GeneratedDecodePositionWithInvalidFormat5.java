package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodePositionWithInvalidFormat5 {

    @Test
    public void decodePositionWithInvalidFormat5() {
        Map<String, String> data = new HashMap<>();
        data.put("lat", "1234567890.1e-2");
        data.put("lon", "12345");
        Position position = Parser.parse(data);
        assertNull(position.getLat());
        assertNull(position.getLon());
    }

}