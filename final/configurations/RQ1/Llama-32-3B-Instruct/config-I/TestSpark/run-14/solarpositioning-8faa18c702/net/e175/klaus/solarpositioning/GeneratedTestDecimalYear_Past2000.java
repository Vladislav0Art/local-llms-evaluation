package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYear_Past2000 {

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
    public void testDecimalYear_Past2000() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(-150.5, deltaT.decimalYear(forDate), 0.01);
    }

}