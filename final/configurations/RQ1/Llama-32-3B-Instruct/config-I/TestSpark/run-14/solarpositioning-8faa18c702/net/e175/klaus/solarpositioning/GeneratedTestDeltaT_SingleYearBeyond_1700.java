package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaT_SingleYearBeyond_1700 {

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
    public void testDeltaT_SingleYearBeyond_1700() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(-27.59, deltaT.estimate(forDate), 0.01);
    }

}