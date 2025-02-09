package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithIllegalTemperatureTest {

    @Test
    public void calculateSolarPositionWithIllegalTemperatureTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 45.0, 180.0, 68.0, 1013.25, -50.0);
    }

}