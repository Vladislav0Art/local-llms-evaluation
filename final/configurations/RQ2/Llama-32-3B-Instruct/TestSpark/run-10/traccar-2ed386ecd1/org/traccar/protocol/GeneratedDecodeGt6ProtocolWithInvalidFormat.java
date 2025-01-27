package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodeGt6ProtocolWithInvalidFormat {

    @Test
    public void decodeGt6ProtocolWithInvalidFormat() {
        Map<String, String> data = new HashMap<>();
        data.put("timestamp", "1234567890");
        data.put("lat", "12345");
        Network network = Parser.parse(data);
        assertNull(network.getPosition());
    }

}