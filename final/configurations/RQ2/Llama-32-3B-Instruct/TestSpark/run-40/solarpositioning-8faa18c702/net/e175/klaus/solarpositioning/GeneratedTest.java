package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static final double SOLSTA_SYST = 0;
    public static final double DELTA_T_WAS_ZERO_ON_PREVIOUS_DAY = -1;
    public static final double SOLSTA_SYST_MINUS_THREE = -3;

    public static double estimate(final LocalDate forDate) {
        // implementation
        return 0;
    }
}

public class DeltaT_test {

    @Test
    public void estimate_DeltaTIsZeroForNoDate() {
        assertEquals(0, DeltaT.estimate(null));
    }

    @Test
    public void estimate_NoDeltaTForToday() {
        LocalDate today = LocalDate.now();
        assertEquals(-1, DeltaT.estimate(today));
    }

    @Test
    public void estimate_NoDeltaTForYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        assertEquals(-1, DeltaT.estimate(yesterday));
    }

    @Test
    public void estimate_NoDeltaTForTodayInUTCMarch() {
        LocalDateTime today = LocalDateTime.of(1970, 3, 1, 0, 0);
        LocalDate date = today.toLocalDate();
        assertEquals(-1, DeltaT.estimate(date));
    }

}