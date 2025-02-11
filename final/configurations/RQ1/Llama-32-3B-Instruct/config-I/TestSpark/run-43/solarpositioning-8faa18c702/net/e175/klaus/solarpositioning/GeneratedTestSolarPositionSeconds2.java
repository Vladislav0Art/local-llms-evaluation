package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositionSeconds2 {

    public double calculateSolarPosition(double latitude, double longitude) {
        return latitude + longitude;
    }
}

public class TestSolarPositioning {

    @Test
    public void testSolarPositionSeconds2() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double result = solarPositioning.calculateSolarPosition(10583.6, 0.0);
        assertEquals(10583.6, result);
    }

}