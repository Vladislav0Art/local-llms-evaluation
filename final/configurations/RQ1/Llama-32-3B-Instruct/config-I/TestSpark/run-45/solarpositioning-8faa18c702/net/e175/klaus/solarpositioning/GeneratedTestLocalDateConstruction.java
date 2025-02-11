package net.e175.klaus.solarpositioning;

public class GeneratedTestLocalDateConstruction {

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
    public void testLocalDateConstruction() {
        LocalDate date = new LocalDate(2023, 6, 25);
        System.out.println(date); // Expected output: "2023-06-25"
    }

}