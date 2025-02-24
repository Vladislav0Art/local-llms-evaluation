package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void decodeEventPositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Position position = (Position) decoder.decode(null, null, "eventPosition");

        assertNotNull(position);
        assertEquals(new Date(1567024196000L), position.getFixTime());
        assertEquals(18.449742, position.getLatitude(), 0.000001);
        assertEquals(-72.287828, position.getLongitude(), 0.000001);
        assertEquals(0, position.getAccuracy());
        assertEquals(0, position.getSpeed());
        assertEquals(0, position.getCourse());
    }

}