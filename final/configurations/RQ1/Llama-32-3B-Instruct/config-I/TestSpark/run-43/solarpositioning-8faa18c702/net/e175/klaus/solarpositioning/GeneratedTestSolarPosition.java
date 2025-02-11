package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPosition {

    public double calculateSolarPosition(double latitude, double longitude) {
        return latitude + longitude;
    }
}

public class TestSolarPositioning {

    @Test
    public void testSolarPosition() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double result = solarPositioning.calculateSolarPosition(0.0, 0.0);
        assertEquals(0.0, result);
    }

}