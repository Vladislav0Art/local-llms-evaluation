package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeLatitudeAndLongitude {

    @Test
    public void testDecodeLatitudeAndLongitude() {
        TestDeviceSession deviceSession = createDeviceSession(37.7749, -122.4194);
        assertEquals(37.7749, ((TestPosition) Main.decodeLatLong(deviceSession)).latitude(), 0.001);
        assertEquals(-122.4194, ((TestPosition) Main.decodeLatLong(deviceSession)).longitude(), 0.001);
    }

    private TestPosition decodeLatLong(TestDeviceSession session) {
        int result = session.getLatitude();
        return new TestPosition(result, null);
    }

}