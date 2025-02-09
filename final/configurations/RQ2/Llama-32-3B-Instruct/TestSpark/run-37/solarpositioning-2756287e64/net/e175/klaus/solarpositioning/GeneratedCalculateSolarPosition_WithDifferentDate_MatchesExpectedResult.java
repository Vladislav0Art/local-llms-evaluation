package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_WithDifferentDate_MatchesExpectedResult {

    @Test
    public void calculateSolarPosition_WithDifferentDate_MatchesExpectedResult() {
        ZonedDateTime date1 = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime date2 = ZonedDateTime.now(ZoneOffset.UTC).plusDays(1);
        double pressure = 101325.0;
        double temperature = -10.0;
        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date1, 37.7749, -122.4194, 8.0, pressure, temperature);
        assertNotNull(result1);
        AzimuthZenithAngle result2 = Grena3.calculateSolarPosition(date2, 37.7749, -122.4194, 8.0, pressure, temperature);
        assertNotNull(result2);
        assertEquals(AzimuthZenithAngle.DEFAULT, result1);
        assertEquals(AzimuthZenithAngle.DEFAULT, result2);
    }

}

class AzimuthZenithAngle {
    public static final double DEFAULT = new HashMap<String, Object>() {{
        put("azimuth", 0.0);
        put("zenith", 0.0);
    }};

    public static class Default implements AzimuthZenithAngle {
        @Override
        public String toString() {
            return "AzimuthZenithAngle{" +
                    "azimuth=" + (double) getDefault() + ", zenith=" + (double) getDefault() +
                    '}';
        }
    }

    private static Object getDefault() {
        try {
            return this.getClass().getField("DEFAULT").get(this);
        } catch (Exception e) {
            return null;
        }
    }

}