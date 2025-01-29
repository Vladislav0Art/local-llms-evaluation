package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeLongitude {

    @Test
    public void testDecodeLongitude() {
        TestDeviceSession deviceSession = new TestDeviceSession();
        assertEquals(-122.4194, ((TestPosition) Main.decodeLatLong(deviceSession)).longitude(), 0.001);
    }

    private TestDeviceSession createDeviceSession(int latitude, int longitude) {
        return new TestDeviceSession(latitude, longitude);
    }

}