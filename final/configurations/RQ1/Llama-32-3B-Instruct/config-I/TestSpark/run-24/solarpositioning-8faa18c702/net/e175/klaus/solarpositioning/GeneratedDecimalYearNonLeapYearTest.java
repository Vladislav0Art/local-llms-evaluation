package net.e175.klaus.solarpositioning;

public class GeneratedDecimalYearNonLeapYearTest {

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
    public void decimalYearNonLeapYearTest() {
        LocalDate forDate = createLocalDate(2003, 2, 28);
        int expected = DeltaT.decimalYear(forDate);
        assertEquals(2004, expected);
    }

}