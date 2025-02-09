package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static void estimate(LocalDate forDate) {
    }

    public static boolean isLeapYear(LocalDate forDate) {
    }
}

public class DeltaTTest {

    @Test
    public void testEstimateDoesNotThrowExceptionForValidDate() {
        LocalDate forDate = LocalDate.of(2020, 1, 31);
        try {
            DeltaT.estimate(forDate);
            assertTrue(true);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    @Test
    public void testEstimateThrowsExceptionForInvalidDate() {
        LocalDate forDate = LocalDate.of(2020, 13, 31);
        assertThrows(Exception.class, () -> DeltaT.estimate(forDate));
    }

}