package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedTestToRadians {

    @Test
    public void testToRadians() {
        final int degrees = 180;
        double rad = toDegrees(degrees);
        assertTrue(Math.abs(rad - Math.PI) < 1e-9);
    }

}