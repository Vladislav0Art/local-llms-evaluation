package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestFor_2022_01_15 {

    private LocalDate forTest = null;

    @BeforeEach
    public void setup() {
        forTest = new LocalDate();
    }

    @Test
    public void testFor_2022_01_15() {
        LocalDate date1 = forTest;
        forTest = new LocalDate(2022, 1, 16);
        assertEqual(0, calculateYearDifference(date1, forTest));
        assertEquals(1, calculateMonthDifference(date1, forTest));
        assertEquals(5, calculateDayDifference(date1, forTest));

        forTest = new LocalDate(2022, 1, 15);
    }

    public double calculateYearDifference(LocalDate date1, LocalDate date2) {
        return Math.abs((date1.getYear() - date2.getYear()));
    }

    public int calculateMonthDifference(LocalDate date1, LocalDate date2) {
        if (date2.getMonthValue() < date1.getMonthValue()) {
            return 6;
        } else if (date2.getMonthValue() == date1.getMonthValue() && date2.getDayOfMonth() > date1.getDayOfMonth()) {
            return 1;
        } else if (date2.getMonthValue() == date1.getMonthValue() && date2.getDayOfMonth() < date1.getDayOfMonth()) {
            return -1;
        } else if (date2.getMonthValue() != date1.getMonthValue()) {
            return -1;
        }
    }

    public int calculateDayDifference(LocalDate date1, LocalDate date2) {
        if ((date1.getDayOfMonth() == date2.getDayOfMonth()) && (date1.getMonthValue() == date2.getMonthValue())) {
            return 0;
        } else if (date1.getYear() != date2.getYear()) {
            return -4;
        } else if (date1.getMonthValue() < date2.getMonthValue()) {
            return 1;
        } else if (date1.getMonthValue() > date2.getMonthValue()) {
            return -1;
        }
    }

}