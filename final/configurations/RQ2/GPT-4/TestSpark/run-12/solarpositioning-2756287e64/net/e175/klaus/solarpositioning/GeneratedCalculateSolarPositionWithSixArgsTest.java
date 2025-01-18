package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithSixArgsTest {

    @Test
    public void calculateSolarPositionWithSixArgsTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8, 1000.0, 20.0);

        assertNotNull(result);
        assertTrue(result instanceof AzimuthZenithAngle);
    }

}