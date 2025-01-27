package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodeGt6ProtocolWithInvalidFormat2 {

    @Test
    public void decodeGt6ProtocolWithInvalidFormat2() {
        Map<String, String> data = new HashMap<>();
        data.put("timestamp", DateBuilder.build(new Date()));
        data.put("lat", "a");
        Network network = Parser.parse(data);
        assertNull(network.getPosition());
    }

}