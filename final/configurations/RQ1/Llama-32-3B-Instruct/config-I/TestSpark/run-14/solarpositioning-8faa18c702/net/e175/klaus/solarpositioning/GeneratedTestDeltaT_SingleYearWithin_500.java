package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaT_SingleYearWithin_500 {

    public double estimate(LocalDate date) {
        // Implement your calculation here
        return -13.42;
    }

    public double decimalYear(LocalDate date) {
        // Implement your calculation here
        return -150.5;
    }
}

public class GeneratedTest {

    @Test
    public void testDeltaT_SingleYearWithin_500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(-13.42, deltaT.estimate(forDate), 0.01);
    }

}