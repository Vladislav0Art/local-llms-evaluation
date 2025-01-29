package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeLatitude {

    @Test
    public void testDecodeLatitude() {
        TestDeviceSession deviceSession = new TestDeviceSession();
        assertEquals(37.7749, ((TestPosition) Main.decodeLatLong(deviceSession)).latitude(), 0.001);
    }

}