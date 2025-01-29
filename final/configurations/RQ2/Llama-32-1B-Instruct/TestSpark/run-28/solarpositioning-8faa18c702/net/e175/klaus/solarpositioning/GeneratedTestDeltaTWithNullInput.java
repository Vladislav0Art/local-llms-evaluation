package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaTWithNullInput {

    private static final String DATE = "2022-12-31";
    private static final long DELTA_T = 0;

    public LocalDate getLocalDate() {
        return LocalDate.of(2022, 12, DATE);
    }

    public void testDeltaTWithNullDate() throws Exception {
        try {
            new DeltaT();
            fail("Test failed");
        } catch (NullPointerException e) {
            assert false;
        }
    }

    @Test
    public void testDeltaTWithNullInput() {
        try {
            new DeltaT(null);
            fail("Test failed");
        } catch (NullPointerException e) {
            assert false;
        }
    }

}