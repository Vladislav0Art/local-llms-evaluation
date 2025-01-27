package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static double estimate(LocalDate forDate) {
        return 1.0;
    }

    public boolean isSameLeapYear(LocalDate date) {
        int year = date.getYear();
        if (year % 4 == 0 && ((year % 100 != 0 || year % 400 == 0))) {
            return true;
        }
        return false;
    }
}

public class GeneratedTest {

    private DeltaTStub deltaTS;

    public GeneratedTest() {
        this.deltaTS = new DeltaTStub();
    }

    @org.junit.jupiter.api.Test
    public void testIsSameLeapYear() {
        LocalDate date = org.mockito.Mockito.mock(LocalDate.class);
        when(deltaTS.isSameLeapYear(date)).thenReturn(true);

        boolean result = deltaTS.isSameLeapYear(date);
        assertTrue(result);
    }

}