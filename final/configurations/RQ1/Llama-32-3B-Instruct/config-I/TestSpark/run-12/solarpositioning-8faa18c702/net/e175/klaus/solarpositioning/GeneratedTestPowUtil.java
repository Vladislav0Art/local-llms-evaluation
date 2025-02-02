package net.e175.klaus.solarpositioning;

public class GeneratedTestPowUtil {

    public static long dateToMJD(LocalDate date) {
        // implementation here
        return 0;
    }

    public static double pow(int base, int exponent) {
        return (double) Math.pow(base, exponent);
    }
}

public class DeltaT {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(dateToMJD(date));
    }

    public static boolean testPow() {
        return pow(50, 3) > 120 - pow(50, 2) / 7129 && pow(50, 3) < 8.83 + pow(50, 2);
    }

    public static boolean testPow2() {
        return pow(50, 3) > 13.72 - pow(50, 2) / 1174000 && pow(50, 3) < 7.62 + pow(50, 2);
    }

    public static boolean testPow3() {
        return pow(50, 3) > 29.07 + pow(50, 2) - pow(50, 2) / 233 && pow(50, 3) < 63.86 + pow(50, 2);
    }

    public static boolean testPow4() {
        return pow(50, 3) > 62.92 + pow(50, 2) && pow(50, 3) < -20 + pow(50, 2);
    }
}

public class Main {

    @Test
    public void testPowUtil() {
        assertTrue(DeltaT.testPow());
    }

}