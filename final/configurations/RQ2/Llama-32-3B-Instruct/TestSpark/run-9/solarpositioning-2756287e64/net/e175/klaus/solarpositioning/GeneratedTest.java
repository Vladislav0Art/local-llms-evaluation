package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTest {

    @Test
    public void testSolarPosition() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        // Add code to test solar positioning here
    }

    @Test
    public void testAzimuthZenithAngle() {
        AzimuthZenithAngle result = new AzimuthZenithAngle(-10.23);
        assertEquals(-10.23, result.getZenith(), 0.01);
    }
}

class AzimuthZenithAngle {

    private double zenith;

    public AzimuthZenithAngle(double zenith) {
        this.zenith = zenith;
    }

    public double getZenith() {
        return zenith;
    }

}