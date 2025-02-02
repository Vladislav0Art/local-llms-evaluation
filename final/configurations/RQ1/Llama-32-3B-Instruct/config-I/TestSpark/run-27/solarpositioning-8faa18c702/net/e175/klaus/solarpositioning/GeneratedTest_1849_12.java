package net.e175.klaus.solarpositioning;

public class GeneratedTest_1849_12 {

    private int year;

    public double calculateSolarPosition(int year, String month) {
        if (month.equals("12")) {
            return -20 + 32 * Math.pow(((48.0) / 100), 2) - 0.5628 * (year - 1849);
        } else {
            int monthNumber = Integer.parseInt(month);
            return (year % 4 + year / 4 - 2 * (year % 100) + year / 400) * 29.53058868;
        }
    }

    public static class TestSolarPosition {

        @Test
        public void test_1849_12() {
            SolarPosition sp = new SolarPosition();
            System.out.println(sp.calculateSolarPosition(1849, "12"));
        }

    }