package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPositionLatitudeLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        System.out.println(result.toLocalDate());
    }

    public class DateTime {
        int year;

        public DateTime(int y) {
            this.year = y;
        }
    }

    @Test
    public void testDateTimeConstructorZero() {
        new DateTime(0);
    }

    @Test
    public void testDateTimeConstructorInvalidValues() {
        try {
            new DateTime(-1, -2, -3); // no-op
        } catch (Exception e) {
            fail("Expected Exception");
        }
    }

    @Test
    public void testCalculateSolarPositionLatitudeLongitudeInvalidDate() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 30, 12, 0);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCalculateSolarPositionLatitudeLongitudeZero() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 31, 0, 0);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void testAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        System.out.println(result.getAzimuth());
    }

    @Test
    public void testGetLocalDate() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        System.out.println(new DateTime().year);
    }

    @Test
    public void testException() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;

        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, 1);
            fail("Expected Exception");
        } catch (Exception e) {
            // expected
        }
    }

    public class AzimuthZenithAngle {
        private int azimuth;
        private int zenith;

        public AzimuthZenithAngle(int azimuth, int zenith) {
            this.azimuth = azimuth;
            this.zenith = zenith;
        }

        public int getAzimuth() {
            return azimuth;
        }

        public void setAzimuth(int azimuth) {
            this.azimuth = azimuth;
        }

        public int getZenith() {
            return zenith;
        }

        public void setZenith(int zenith) {
            this.zenith = zenith;
        }
    }

}