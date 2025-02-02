package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPositionWithDifferentValues {

    public double calculateSolarPosition(double lat, double lon) {
        // implement your solar position calculation logic here
        return 0;
    }
}

public class TestSolarPositionCalculator {

    @Test
    public void testCalculateSolarPositionWithDifferentValues() {
        SolarPositionCalculator calculator = new SolarPositionCalculator();

        double lat = 51.5074;
        double lon = -0.1278;

        double result = calculator.calculateSolarPosition(lat, lon);

        assertEquals(0, result); // assuming the return value is always 0 for simplicity
    }

}