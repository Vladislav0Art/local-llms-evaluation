package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static double calculateG(double azimuth) {
        return 2 * Math.pow(azimuth, 2);
    }
}

public class DateUtil {
    public String toUTCDate(ZonedDateTime zdt) {
        return zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }
}

public class Grena3CalculatorTest {

}