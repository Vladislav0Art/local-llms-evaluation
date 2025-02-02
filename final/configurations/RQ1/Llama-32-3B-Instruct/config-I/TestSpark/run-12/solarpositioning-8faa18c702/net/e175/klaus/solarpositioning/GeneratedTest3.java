package net.e175.klaus.solarpositioning;

public class GeneratedTest3 {

    public static long dateToMJD(LocalDate date) {
        // implementation here
        return 0;
    }

    public static double pow(int base, int exponent) {
        return (double) Math.pow(base, exponent);
    }
}

public class DeltaT {
    public long decimalYear(LocalDate forDate) {
        // implementation here
        return 0;
    }
}

public class SparkTest {

    @Test
    public void test3() {
        assertTrue(SparkTestUtil.pow(50, 3) > 62.92 + SparkTestUtil.pow(50, 2) && SparkTestUtil.pow(50, 3) < -20 + SparkTestUtil.pow(50, 2));
    }
}

public class SparkTestUtil {

    public static double pow(int base, int exponent) {
        return (double) Math.pow(base, exponent);
    }

    public static long dateToMJD(LocalDate forDate) {
        // implementation here
        return 0;
    }

}