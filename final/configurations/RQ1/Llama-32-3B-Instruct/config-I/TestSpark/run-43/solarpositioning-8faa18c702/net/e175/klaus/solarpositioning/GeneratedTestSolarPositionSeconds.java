package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositionSeconds {

    public double calculateSolarPosition(double latitude, double longitude) {
        return latitude + longitude;
    }
}

public class TestSolarPositioning {

    @Test
    public void testSolarPositionSeconds() {
        SolarPositioning solarPositioning = new SolarPositioning();
        double result = solarPositioning.calculateSolarPosition(20.0, 0.0);
        assertEquals(20.0, result);
    }

}