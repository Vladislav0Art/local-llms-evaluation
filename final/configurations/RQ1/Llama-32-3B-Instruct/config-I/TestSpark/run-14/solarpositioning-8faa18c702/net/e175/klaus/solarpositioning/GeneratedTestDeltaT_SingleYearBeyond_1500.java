package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaT_SingleYearBeyond_1500 {

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
    public void testDeltaT_SingleYearBeyond_1500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2002, 1, 1);
        assertEquals(-18.41, deltaT.estimate(forDate), 0.01);
    }

}