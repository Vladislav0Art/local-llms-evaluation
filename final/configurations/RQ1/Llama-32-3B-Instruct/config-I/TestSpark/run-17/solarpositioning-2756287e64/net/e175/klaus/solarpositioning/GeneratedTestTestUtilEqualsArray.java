package net.e175.klaus.solarpositioning;

public class GeneratedTestTestUtilEqualsArray {

    public static double calculate(String input) {
        // implementation of Grena3 method
        return 0;
    }
}

public class DateUtil {
    public static ZonedDateTime fromDateTime(DateTime dateTime, ZoneId zoneId) {
        // implementation of fromDateTime method
        return null;
    }

    public static DateTime fromZonedDateTime(ZonedDateTime zdt) {
        // implementation of fromZonedDateTime method
        return null;
    }

    public static void now() {
        // implementation of now method
    }
}

public class TestUtil {
    public static void assertEquals(int actual, double expected, double delta) {
        // implementation of assertEquals method
    }

    public static void assertNotEquals(int actual, double expected, double delta) {
        // implementation of assertNotEquals method
    }

    public static boolean isWithinDelta(double actual, double expected, double delta) {
        // implementation of isWithinDelta method
        return false;
    }
}

public class Grena3Test {

    @Test
    public void testTestUtilEqualsArray() {
        int[] array = {1, 2, 3};
        int actual = Arrays.stream(array).sum();
        assertEquals(6, actual);
    }
}

}