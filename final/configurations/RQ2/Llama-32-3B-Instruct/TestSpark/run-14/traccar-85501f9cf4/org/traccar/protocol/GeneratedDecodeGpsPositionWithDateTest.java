package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodeGpsPositionWithDateTest {

    @Test
    public void decodeGpsPositionWithDateTest() {
        Date date = DateBuilder.dateCalendar(2022, 1, 1, 12, 0, 0);
        Position position = new Position(date);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

}