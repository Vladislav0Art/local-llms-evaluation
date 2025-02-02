package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public static class Date {
        private ZonedDateTime date;

        public static Date createDate(ZonedDateTime date) {
            this.date = date;
            return new Date();
        }

        public ZonedDateTime getDate() {
            return date;
        }
    }

    @Test
    public void testGrena3() {
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(new Date().createDate(ZonedDateTime.now()), 37.7749, -122.4194, 360);
        assertEquals("test result", "test result");
    }
}

public class Grena3 {

    private String grena3;

    public static Grena3 createGrena3(String grena3) {
        Grena3 grena3Instance = new Grena3();
        grena3Instance.grena3 = grena3;
        return grena3Instance;
    }

    public AzimuthZenithAngle calculateSolarPosition(Date date, double latitude, double longitude, int deltaT) {
        // code to calculate solar position
        return null;
    }
}

public class AzimuthZenithAngle {
    private String azimuth;
    private String zenith;

    public static AzimuthZenithAngle createAzimuthZenithAngle(String azimuth, String zenith) {
        AzimuthZenithAngle azZ = new AzimuthZenithAngle();
        azZ.azimuth = azimuth;
        azZ.zenith = zenith;
        return azZ;
    }
}

public class ZoneOffset {
    private int offset;

    public static ZoneOffset createZoneOffset(int offset) {
        ZoneOffset zoneOffset = new ZoneOffset();
        zoneOffset.offset = offset;
        return zoneOffset;
    }

}