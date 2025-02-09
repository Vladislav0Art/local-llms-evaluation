package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithIllegalLatitudeTest {

    @Test
    public void calculateSolarPositionWithIllegalLatitudeTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 100.0, 180.0, 68.0);
    }

}