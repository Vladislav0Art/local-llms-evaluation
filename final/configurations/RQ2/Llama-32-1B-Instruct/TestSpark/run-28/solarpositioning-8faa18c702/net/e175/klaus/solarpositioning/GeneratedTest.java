package net.e175.klaus.solarpositioning;

public class GeneratedTest {

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

    public void testDeltaTWithNullDate() throws Exception {
        try {
            new DeltaT();
            fail("Test failed");
        } catch (NullPointerException e) {
            assert false;
        }

        LocalDate localDate = DeltaT.getLocalDate().of(DATE);
        Assert.assertEquals(0, DeltaT.getDeltaT(), 1E-6);

        localDate.setLocalDate("2022-12-30");
        System.out.println(localDate.toString() + " " + DATE);
    }

    private static LocalDate getLocalDate() {
        return new LocalDate();
    }

}