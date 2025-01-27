package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodePosition {

    @Test
    public void decodePosition() {
        Map<String, String> data = new HashMap<>();
        data.put("lat", "12345");
        data.put("lon", "67890");
        Position position = Parser.parse(data);
        assertTrue(position.getLat().matches("^\\d+$"));
        assertTrue(position.getLon().matches("^\\d+$"));
    }

}