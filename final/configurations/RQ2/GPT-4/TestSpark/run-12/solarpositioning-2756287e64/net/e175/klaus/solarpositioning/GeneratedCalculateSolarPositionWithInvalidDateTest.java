package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithInvalidDateTest {

    @Test
    public void calculateSolarPositionWithInvalidDateTest() {
        ZonedDateTime mockedDateTime = null;
        Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8);
    }

}