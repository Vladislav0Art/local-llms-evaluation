package net.e175.klaus.solarpositioning;

public class GeneratedTest {

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

    @Test
    public void testSolarPositionSeconds() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double result = solarPositioning.calculateSolarPosition(20.0, 0.0);
        assertEquals(20.0, result);
    }

    @Test
    public void testSolarPositionSeconds2() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double result = solarPositioning.calculateSolarPosition(10583.6, 0.0);
        assertEquals(10583.6, result);
    }

}