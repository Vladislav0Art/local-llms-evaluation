package net.e175.klaus.solarpositioning;

public class GeneratedMockGrena3_calculateSolarPosition_ReturnsCorrectAngle {

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return new AzimuthZenithAngle(45.0, 30.0);
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        return new AzimuthZenithAngle(40.0, 25.0);
    }
}

public class GeneratedTest {

    @Test
    public void mockGrena3_calculateSolarPosition_ReturnsCorrectAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;
        AzimuthZenithAngle result = MockGrena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        // TODO: implement test
    }

}