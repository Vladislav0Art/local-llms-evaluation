package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodePositionWithInvalidFormat {

    @Test
    public void decodePositionWithInvalidFormat() {
        Map<String, String> data = new HashMap<>();
        data.put("lat", "a");
        data.put("lon", "12345");
        Position position = Parser.parse(data);
        assertNull(position.getLat());
        assertNull(position.getLon());
    }

}