package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

import static net.e175.klaus.solarpositioning.Grena3.*;
import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPosition_deltaTNoPressureNoTemperatureLatitudeLongitude {

    private Grena3 instance;

    @Before
    public void setup() {
        instance = new Grena3();
    }

    @Test
    public void testCalculateSolarPosition_deltaTNoPressureNoTemperatureLatitudeLongitude() {
        // Arrange
        ZonedDateTime expectedDate = getExpectedDate(ZonedDateTime.now(ZoneOffset.UTC));
        double[] expectedAngles = {getExpectedAngle(expectedDate, null), getExpectedAngle(expectedDate, null)};
        double deltaT = 1; // arbitrary value

        // Act and Assert
        AzimuthZenithAngle result = instance.calculateSolarPosition(null, null, null, deltaT);

        // Verify
        assertEquals(expectedAngles[0], result.getAzimuthZenithAngle());
        assertEquals(expectedAngles[1], result.getAzimuthZenithAngle());
    }

}