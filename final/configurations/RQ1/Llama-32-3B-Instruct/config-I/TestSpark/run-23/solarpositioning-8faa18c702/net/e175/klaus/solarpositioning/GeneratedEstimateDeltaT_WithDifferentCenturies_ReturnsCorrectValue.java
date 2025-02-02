package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaT_WithDifferentCenturies_ReturnsCorrectValue {

    @Test
    public void estimateDeltaT_WithDifferentCenturies_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1961, 12, 31);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(((1961 - 1950) / 10), 2) - 0.05, result, 0.00001);
    }
}

public class UnitTests {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("net.e175.klaus.solarpositioning.DeltaTTest");
    }

}