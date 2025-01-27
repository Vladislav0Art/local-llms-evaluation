package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodeGt6Protocol {

    @Test
    public void decodeGt6Protocol() {
        Map<String, String> data = new HashMap<>();
        data.put("timestamp", DateBuilder.build(new Date()));
        data.put("lat", "12345");
        data.put("lon", "67890");
        Network network = Parser.parse(data);
        assertEquals(12345L, network.getPosition().getLat());
        assertEquals(67890L, network.getPosition().getLon());
    }

}