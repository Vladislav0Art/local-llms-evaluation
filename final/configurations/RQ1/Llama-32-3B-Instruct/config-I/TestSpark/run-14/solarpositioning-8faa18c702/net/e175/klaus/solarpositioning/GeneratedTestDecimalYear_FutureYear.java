package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYear_FutureYear {

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
    public void testDecimalYear_FutureYear() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(275.8, deltaT.decimalYear(forDate), 0.01);
    }

}