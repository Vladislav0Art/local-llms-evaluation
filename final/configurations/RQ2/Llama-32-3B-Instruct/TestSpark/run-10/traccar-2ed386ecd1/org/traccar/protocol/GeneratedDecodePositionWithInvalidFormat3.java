package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodePositionWithInvalidFormat3 {

    @Test
    public void decodePositionWithInvalidFormat3() {
        Map<String, String> data = new HashMap<>();
        data.put("lat", "1234.56");
        data.put("lon", "12345");
        Position position = Parser.parse(data);
        assertNull(position.getLat());
        assertNull(position.getLon());
    }

}