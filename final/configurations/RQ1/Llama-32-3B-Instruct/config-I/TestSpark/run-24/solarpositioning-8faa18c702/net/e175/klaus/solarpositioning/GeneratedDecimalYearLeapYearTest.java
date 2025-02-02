package net.e175.klaus.solarpositioning;

public class GeneratedDecimalYearLeapYearTest {

    public static double estimate(LocalDate date) {
        // implementation
    }

    public static int decimalYear(LocalDate date) {
        // implementation
    }
}

public class DeltaTTest {

    public LocalDate createLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    @Test
    public void decimalYearLeapYearTest() {
        LocalDate forDate = createLocalDate(2004, 2, 29);
        int expected = DeltaT.decimalYear(forDate);
        assertEquals(2005, expected);
    }

}