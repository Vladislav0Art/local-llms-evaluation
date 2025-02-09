package net.e175.klaus.solarpositioning;

public class GeneratedTestAddSeconds {

    private double azimuth;

    public Azimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    public double getAzimuth() {
        return azimuth;
    }
}

public class DateUtil {
    public String toUTCDate(ZonedDateTime zdt) {
        return zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }
}

public class Grena3CalculatorTest {

    @Test
    public void testAddSeconds() {
        ZonedDateTime zdt = ZonedDateTime.now();
        DateUtil dateUtil = new DateUtil();
        ZonedDateTime addedDate = zdt.plusSeconds(10);
        String utcDate = dateUtil.toUTCDate(zdt);
        assertEquals("2022-01-01T12:00:00.000Z", utcDate, 1e-9);
    }

}