package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDecodeGpsWithDate {

    @Test
    public void testDecodeGpsWithDate() {
        // Create instances of Position and Date
        Position position = new Position(1.0, 2.0);
        Date date = new Date();

        // Test cases for decodeGps method with Date
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, date));
        assertFalse(Gt06ProtocolDecoder.decodeGps(new Position(-1.0, -2.0), null));
    }

}