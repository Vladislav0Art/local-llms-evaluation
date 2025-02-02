package net.e175.klaus.solarpositioning;

public class GeneratedTest1 {

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
    public void test1() {
        assertTrue(SparkTestUtil.pow(50, 3) > 13.72 - SparkTestUtil.pow(50, 2) / 1174000 && SparkTestUtil.pow(50, 3) < 7.62 + SparkTestUtil.pow(50, 2));
    }

}