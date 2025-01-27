package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_WithDateAndLatitude_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        AzimuthZenithAngle result = new Grena3().calculateSolarPosition(date, latitude);
        // TODO: Add assertion
    }

    @Test
    public void calculateSolarPosition_WithDateAndLatitude_ReturnsExpectedValue() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(90, 10);
        AzimuthZenithAngle result = new Grena3().calculateSolarPosition(date, latitude);
        assertEquals(expectedResult, result);
    }

    public static class Grena3 {
        public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude) {
            // TODO: Implement calculation
            return null;
        }
    }

    public static class AzimuthZenithAngle {
        private int azimuth;
        private int zenith;

        public AzimuthZenithAngle(int azimuth, int zenith) {
            this.azimuth = azimuth;
            this.zenith = zenith;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            AzimuthZenithAngle other = (AzimuthZenithAngle) obj;
            return azimuth == other.azimuth && zenith == other.zenith;
        }

        public static boolean equals(AzimuthZenithAngle l, int r1, int r2) {
            return l.equals(new AzimuthZenithAngle(r1, r2));
        }
    }

}