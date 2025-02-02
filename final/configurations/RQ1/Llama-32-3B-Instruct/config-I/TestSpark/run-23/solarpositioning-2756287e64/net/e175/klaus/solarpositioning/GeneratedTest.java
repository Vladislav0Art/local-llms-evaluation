package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private double latitude;
    private double longitude;

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

    public SunPosition calculateSunPosition(SunPosition sunPosition) {
        // Implement your calculation logic here
        return new SunPosition(sunPosition.getLatitude(), sunPosition.getLongitude());
    }
}

public class Grena3CalculatorTest {

}