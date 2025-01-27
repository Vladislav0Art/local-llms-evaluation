package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDecodeGpsWithCalendar {

    @Test
    public void testDecodeGpsWithCalendar() {
        // Create instances of Position and Calendar
        Position position = new Position(1.0, 2.0);
        Calendar calendar = Calendar.getInstance();

        // Test cases for decodeGps method with Calendar
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, calendar));
        assertFalse(Gt06ProtocolDecoder.decodeGps(new Position(-1.0, -2.0), null));
    }

}