package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaTDays {

    public double calculateDeltaTHours(int date) {
        // implementation to calculate delta T in hours for given date
        return 0;
    }

    public double calculateDeltaTDays(int date) {
        // implementation to calculate delta T in days for given date
        return 0;
    }
}

public class LocalDate {
    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day;
    }
}

public class GeneratedTest {

    @Test
    public void testDeltaTDays() {
        DeltaT deltaT = new DeltaT();
        double[] expectedValues = {0, 5.4, 11.8, 19.9, 29.7};
        for (int i = 0; i < expectedValues.length; i++) {
            assertEquals(expectedValues[i], deltaT.calculateDeltaTDays(i));
        }
    }

}