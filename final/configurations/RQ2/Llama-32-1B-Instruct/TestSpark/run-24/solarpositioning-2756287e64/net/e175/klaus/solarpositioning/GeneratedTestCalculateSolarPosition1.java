package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPosition1 {

    private static GrentzMocker grentzMocker;

    static {
        grentzMocker = new GrentzMocker();
    }

    public static void main(String[] args) {
        testCalculateSolarPosition1();
    }

    public static void testCalculateSolarPosition() {
        SolarPosition solarPosition = new SolarPosition(37.7749, -122.4194, 0 + 1e30, 0);
        int result = grentzMocker.calculateSolarPosition(solarPosition.latitude, solarPosition.longitude, solarPosition.altitude, solarPosition.elevation, solarPosition);

        assertEquals(0, result); // Test that no exception is thrown
    }

    public static void testCalculateSolarPosition1() {
        SolarPosition solarPosition = new SolarPosition(37.7749, -122.4194, 100 + 1e30, 0);
        int result = grentzMocker.calculateSolarPosition(solarPosition.latitude, solarPosition.longitude, solarPosition.altitude, solarPosition.elevation, solarPosition);

        assertEquals(0, result); // Test that no exception is thrown
    }
}

class GrentzMocker {
    public int calculateSolarPosition(double latitude, double longitude, double altitude, int elevation, SolarPosition solarPosition) {
        return Math.round(Math.cos(latitude * Math.PI / 180) * Math.sin(longitude * Math.PI / 360)
                        + (Math.cos(altitude * Math.PI / 180)) * Math.sin(longitude * Math.PI / 360)
                        + ((latitude * Math.PI / 180 - altitude * Math.PI / 180) * Math.sin(elevation * Math.PI / 360)))
                .longValue();
    }
}

class SolarPosition {
    public double longitude, latitude, altitude, elevation;

    public SolarPosition(double longitude, double latitude, double altitude, int elevation) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return "SolarPosition{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                ", elevation=" + elevation +
                '}';
    }
}

class TestSolarPositionCalculator {

    private static GrentzMocker grentzMocker;

    public static void main(String[] args) {
        testCalculateSolarPosition1();
    }

    @Test
    public void testCalculateSolarPosition1() {
        SolarPosition solarPosition = new SolarPosition(37.7749, -122.4194, 100 + 1e30, 0);
        int result = grentzMocker.calculateSolarPosition(solarPosition.latitude, solarPosition.longitude, solarPosition.altitude, solarPosition.elevation, solarPosition);

        assertEquals(0, result); // Test that no exception is thrown
    }

}