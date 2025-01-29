package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestException {

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