package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodePositionValidCoordinatesTest {

    @Test
    public void decodePositionValidCoordinatesTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        assertNull(decoder.decodePosition(null, "161019,092136"));

        Position position = decoder.decodePosition(new DeviceSession(null, 1), "161019,092136,A,4724.97838,N,01905.73138,E,11.0");

        assertEquals(47.41630633, position.getLatitude(), 0.00001);
        assertEquals(19.09552233, position.getLongitude(), 0.00001);
        assertEquals(true, position.getValid());
        assertEquals((float) (10 * 1.852), position.getSpeed(), 0.00001);
    }

}