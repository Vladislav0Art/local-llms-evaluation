package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaTWithValidDate {

    public static LocalDate getLocalDate() {
        return new LocalDate();
    }
}

public class LocalDate {
    private String date;

    public LocalDate of(String date) {
        this.date = date;
        return this;
    }

    public void setLocalDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }
}

public class GeneratedTest {
    private static final String DATE = "2022-12-31";
    private static final long DELTA_T = 0;

    public LocalDate getLocalDate() {
        return DeltaT.getLocalDate().of(DATE);
    }

    @Test
    public void testDeltaTWithValidDate() throws Exception {
        GeneratedTest test = new GeneratedTest();
        Assert.assertEquals(0, DELTA_T, 1E-6);
        test.testGetLocalDateWithNullInput();
        test.testGetLocalDateWithNonValidDate();
        test.testGetLocalDateWithSameDeltaAndDate();
    }

}