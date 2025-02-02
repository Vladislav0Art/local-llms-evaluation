package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private int year;

    public double calculateSolarPosition(int year, String month) {
        if (month.equals("12")) {
            return -20 + 32 * Math.pow(((48.0) / 100), 2) - 0.5628 * (year - 1849);
        } else {
            int monthNumber = Integer.parseInt(month);
            return (year % 4 + year / 4 - 2 * (year % 100) + year / 400) * 29.53058868;
        }
    }

    public static void main(String[] args) {
        org.junit.Test
        public void test_1849_1 () {
            SolarPosition sp = new SolarPosition();
            System.out.println(sp.calculateSolarPosition(1849, "1"));
        }

        @Test
        public void testSolarPosition () {
            SolarPosition sp = new SolarPosition();
            assertEquals(-20 + 32 * Math.pow(((48.0) / 100), 2) - 0.5628 * (2150 - 1849), sp.solarPosition(1849, 12));
        }

        public static class SolarPosition {
            private String month;

            public double solarPosition(int year, int month) {
                this.month = String.valueOf(month);
                return Math.round((year % 4 + year / 4 - 2 * (year % 100) + year / 400) * 29.53058868);
            }
        }

    }