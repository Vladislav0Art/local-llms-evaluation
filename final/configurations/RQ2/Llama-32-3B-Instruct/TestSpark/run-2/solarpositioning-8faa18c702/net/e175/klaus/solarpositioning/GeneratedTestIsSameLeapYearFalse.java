package net.e175.klaus.solarpositioning;

public class GeneratedTestIsSameLeapYearFalse {

    public static double estimate(final LocalDate forDate) {
        return 1.0;
    }

    public static boolean isSameLeapYear(final LocalDate date) {
        int year = date.getYear();
        if (year % 4 == 0 && ((year % 100 != 0 || year % 400 == 0))) {
            return true;
        }
        return false;
    }
}

public class GeneratedTest {

    private DeltaTStub deltaTS;

    @org.junit.jupiter.api.Test
    public void testIsSameLeapYear() {
        LocalDate date = org.mockito.Mockito.mock(LocalDate.class);
        when(deltaTS.isSameLeapYear(date)).thenReturn(true);

        boolean result = deltaTS.isSameLeapYear(date);
        assertTrue(result);
    }

    @Test
    public void testIsSameLeapYearFalse() {
        LocalDate date = org.mockito.Mockito.mock(LocalDate.class);
        when(deltaTS.isSameLeapYear(date)).thenReturn(false);

        boolean result = deltaTS.isSameLeapYear(date);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    public void testEstimate() {
        double result = DeltaTStub.estimate(org.mockito.Mockito.any(LocalDate.class));
        assertEquals(1.0, result);
    }

}