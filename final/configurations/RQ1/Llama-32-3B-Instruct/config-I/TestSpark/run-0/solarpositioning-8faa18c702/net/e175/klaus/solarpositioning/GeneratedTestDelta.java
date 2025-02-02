package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDelta {

    @Test
    public void testDelta() {
        // Arrange
        int year1 = 2000;
        int month1 = 12;
        int day1 = 31;
        int year2 = 1999;
        int month2 = 11;
        int day2 = 30;

        // Act
        Delta delta = new Delta(year1, month1, day1);
        int resultYear = delta.getDeltaYear();
        int resultMonth = delta.getDeltaMonth();
        int resultDay = delta.getDeltaDay();

        // Assert
        assertEquals(1, resultYear);
        assertEquals(-2, resultMonth);
        assertEquals(1, resultDay);
    }
}

class Delta {

    private int year;
    private int month;
    private int day;

    public Delta(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDeltaYear() {
        return year - 1999;
    }

    public int getDeltaMonth() {
        if (month > 11) {
            return month - 12 + 1;
        } else {
            return month + 1;
        }
    }

    public int getDeltaDay() {
        if (day > 30) {
            if (getDeltaMonth() == 2) { // February
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            } else {
                return 31 - day + 1;
            }
        } else {
            return day;
        }
    }

}