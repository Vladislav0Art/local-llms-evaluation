package net.e175.klaus.solarpositioning;

public class GeneratedTest {

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

    @Test
    public void testDeltaT_SingleYearWithin_1500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(1200, 1, 1);
        assertEquals(1018.49, deltaT.estimate(forDate), 0.01);
    }

    @Test
    public void testDeltaT_SingleYearBeyond_1500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2002, 1, 1);
        assertEquals(-18.41, deltaT.estimate(forDate), 0.01);
    }

    @Test
    public void testDeltaT_SingleYearBeyond_1700() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(-27.59, deltaT.estimate(forDate), 0.01);
    }

    @Test
    public void testDecimalYear_Past2000() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(-150.5, deltaT.decimalYear(forDate), 0.01);
    }

    @Test
    public void testDecimalYear_FutureYear() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(275.8, deltaT.decimalYear(forDate), 0.01);
    }

}