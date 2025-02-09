package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateG {

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
    public void testCalculateG() {
        Azimuth az = new Azimuth(45.0);
        double result = 2 * Math.pow(az.getAzimuth(), 2);
        assertEquals(Math.pow(45.0, 2), result, 1e-9);
    }

}