package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NullDate_ThrowsNullPointerException {

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
    public void calculateSolarPosition_NullDate_ThrowsNullPointerException() {
        when(grena3.calcT(date)).thenThrow(new NullPointerException());

        assertThrows(NullPointerException.class, () -> grena3.calculateSolarPosition(latitude, longitude, deltaT, date));
    }
}

public class ZonedDateTimeStub implements ZonedDateTime {
    @Override
    public ZoneId getZone() {
        return null;
    }

    @Override
    public Instant getInstant() {
        return null;
    }

    @Override
    public boolean isSupported() {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T withTempus(Tempus tempus) {
        return (T) null;
    }
}

public class ZoneOffsetStub implements ZoneOffset {
    @Override
    public ZoneId getZone() {
        return null;
    }

    @Override
    public int getTotalSeconds() {
        return 0;
    }

}