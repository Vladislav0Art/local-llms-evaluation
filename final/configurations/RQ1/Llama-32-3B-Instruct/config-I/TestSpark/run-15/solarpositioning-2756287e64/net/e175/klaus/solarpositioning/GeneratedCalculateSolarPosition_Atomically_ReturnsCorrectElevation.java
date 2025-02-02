package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_Atomically_ReturnsCorrectElevation {

    private double azimuth;
    private double elevation;

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }
}

public class Grena3 {
    public AzimuthZenithAngle calculateSolarPosition(double latitude, double longitude, double deltaT, ZonedDateTime date) {
        // implementation
        return new AzimuthZenithAngle();
    }

    public ZonedDateTime calcT(ZonedDateTime date) {
        // implementation
        return null;
    }
}

public class GeneratedTest {

    @Mock
    private ZonedDateTime date;
    @Mock
    private double latitude;
    @Mock
    private double longitude;
    @Mock
    private double deltaT;
    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_Atomically_ReturnsCorrectElevation() {
        when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);
        when(grena3.calcT(date)).thenReturn(new ZonedDateTime());

        AzimuthZenithAngle result = grena3.calculateSolarPosition(latitude, longitude, deltaT, date);
        assertEquals(-10.5, result.getElevation(), 0.01);
    }

}