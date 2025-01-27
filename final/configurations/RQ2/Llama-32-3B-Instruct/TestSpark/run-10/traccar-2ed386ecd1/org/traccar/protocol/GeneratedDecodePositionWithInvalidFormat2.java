package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodePositionWithInvalidFormat2 {

    @Test
    public void decodePositionWithInvalidFormat2() {
        Map<String, String> data = new HashMap<>();
        data.put("lat", "1234567890");
        data.put("lon", "12345");
        Position position = Parser.parse(data);
        assertNull(position.getLat());
        assertNull(position.getLon());
    }

}