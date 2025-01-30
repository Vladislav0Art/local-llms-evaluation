package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;

import static java.lang.Double.MIN_VALUE;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(
                zonedDateTime, 30.3, 75.58, 3600, 1005.5, 23.5);
        assertNotNull("Calculation Failed for with pressure and temperature!", result);
    }

}