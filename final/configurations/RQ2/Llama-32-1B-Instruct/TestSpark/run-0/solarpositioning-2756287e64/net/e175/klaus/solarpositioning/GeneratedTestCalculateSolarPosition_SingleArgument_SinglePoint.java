package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_SingleArgument_SinglePoint {

    private final String[] methodNames = {
            "calculateSolarPosition",
            "calculateSolarPositionDeltaT",
            "calculateSolarPositionPressureTemperature"
    };

    @BeforeEach
    public void setup() {
    }

    public interface MethodUnderTest {
        AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT);

        AzimuthZenithAngle calculateSolarPositionDeltaT(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature);

        AzimuthZenithAngle calculateSolarPositionPressureTemperature(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature);
    }

    public class TestMethodUnderTest {

        @Test
        public void testCalculateSolarPosition_SingleArgument_SinglePoint() {
            MethodUnderTest methodUnderTest = new MethodUnderTest();
            ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(random.nextInt(12)));
            double latitude = random.nextDouble();
            double longitude = random.nextDouble();
            double deltaT = 1.0;

            AzimuthZenithAngle result = (AzimuthZenithAngle) methodUnderTest.calculateSolarPosition(date, latitude, longitude, deltaT);
            assertEquals(latitude, result.getAzimuthZenithAngle().getLatitude());
            assertEquals(longitude, result.getAzimuthZenithAngle().getLongitude());
        }

    }