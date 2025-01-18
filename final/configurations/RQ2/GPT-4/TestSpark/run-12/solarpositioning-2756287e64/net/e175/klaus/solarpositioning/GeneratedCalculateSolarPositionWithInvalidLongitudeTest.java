package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 190.0, 67.8);
    }

}