package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodeGpsPositionWithAllFieldsTest {

    @Test
    public void decodeGpsPositionWithAllFieldsTest() {
        Position position = new Position();
        Date date = DateBuilder.dateCalendar(2022, 1, 1, 12, 0, 0);
        double speed = 100.0;
        int satellites = 12;
        position.setDate(date);
        position.setSpeed(speed);
        position.setSatellites(satellites);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

}