package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYear_GivenDate_0Seconds_ReturnsCorrectDecimalYear {

    @Test
    public void testDecimalYear_GivenDate_0Seconds_ReturnsCorrectDecimalYear() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double decimalYear = DeltaT.decimalYear(date);
        assertEquals(2022, (int) decimalYear, 0);
    }

}