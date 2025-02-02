package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSunPosition {

    private double latitude;
    private double longitude;
    private int altitude;

    public SunPosition() {
    }

    public SunPosition(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

public class SolarPositionCalculator {

    public static SunPosition calculateSunPosition(double latitude, double longitude) {
        // Implement your calculation logic here
        return new SunPosition(latitude, longitude);
    }
}

public class Grena3CalculatorTest {

    @Test
    public void testCalculateSunPosition() {
        SolrPositionCalculator calculator = new SolarPositionCalculator();
        SunPosition sunPosition = calculator.calculateSunPosition(37.7749, -122.4194);
        assertNotNull(sunPosition);
    }

}