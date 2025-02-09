package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static class AzimuthZenithAngle {
        private Object azimuth;
        private Object zenith;

        public AzimuthZenithAngle() {
        }

        public static final double NaN = Double.NaN;

        public void setAzimuth(double azimuth) {
            this.azimuth = azimuth;
        }

        public void setZenith(double zenith) {
            this.zenith = zenith;
        }

        public Object getAzimuth() {
            return azimuth;
        }

        public Object getZenith() {
            return zenith;
        }
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude) {
        // implementation
        return new AzimuthZenithAngle();
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double altitude) {
        // implementation
        return new AzimuthZenithAngle();
    }
}

class TestGrena3 {

    @Test
    public void calculateSolarPosition_LatLng_TNoParamsReturn() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        Grena3.AzimuthZenithAngle actual = new Grena3().calculateSolarPosition(date, latitude, longitude);
        assertNotNull(actual.getAzimuth());
        assertNotNull(actual.getZenith());
    }

    @Test
    public void calculateSolarPosition_LatLng_TWithParamsReturn() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        Grena3.AzimuthZenithAngle actual = new Grena3().calculateSolarPosition(date, latitude, longitude);
        assertNotNull(actual.getAzimuth());
        assertNotNull(actual.getZenith());
    }

    @Test
    public void calculateSolarPosition_LatLng_TNoParamsThrow() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        assertThrows(ClassCastException.class, () -> new Grena3().calculateSolarPosition(date, latitude, longitude));
    }

    @Test
    public void calculateSolarPosition_LatLng_TWithParamsThrow() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        assertThrows(ClassCastException.class, () -> new Grena3().calculateSolarPosition(date, latitude, longitude, null));
    }

}