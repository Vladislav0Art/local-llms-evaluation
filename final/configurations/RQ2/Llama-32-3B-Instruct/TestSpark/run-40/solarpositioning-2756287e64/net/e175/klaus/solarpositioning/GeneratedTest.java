package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private ZonedDateTime date;
    private double latitude;
    private double longitude;

    public AzimuthZenithAngle(ZonedDateTime date, double latitude, double longitude) {
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public OptionalDouble getAzimuth() {
        return java.util.Optional.of(1.0);
    }

    public OptionalDouble getZenith() {
        return java.util.Optional.of(1.0);
    }
}

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithDeltaTZero_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertEquals(null, result);
    }

}