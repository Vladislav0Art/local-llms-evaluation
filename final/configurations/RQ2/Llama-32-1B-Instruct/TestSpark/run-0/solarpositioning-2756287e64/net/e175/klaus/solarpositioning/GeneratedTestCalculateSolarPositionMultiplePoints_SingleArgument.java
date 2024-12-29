package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPositionMultiplePoints_SingleArgument {

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
        public void testCalculateSolarPositionMultiplePoints_SingleArgument() {
            MethodUnderTest methodUnderTest = new MethodUnderTest();
            ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(random.nextInt(12)));
            double latitude1 = random.nextDouble();
            double longitude1 = random.nextDouble();
            double latitude2 = random.nextDouble();
            double longitude2 = random.nextDouble();

            AzimuthZenithAngle result = (AzimuthZenithAngle) methodUnderTest.calculateSolarPosition(date, latitude1, longitude1, 0.01);
            assertEquals(latitude1, result.getAzimuthZenithAngle().getLatitude());
            assertEquals(longitude1, result.getAzimuthZenithAngle().getLongitude());
            assertEquals(latitude2, result.getAzimuthZenithAngle().getLatitude());
            assertEquals(longitude2, result.getAzimuthZenithAngle().getLongitude());
        }

    }