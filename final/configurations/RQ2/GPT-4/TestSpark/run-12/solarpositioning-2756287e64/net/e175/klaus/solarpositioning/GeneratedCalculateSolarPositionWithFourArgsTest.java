package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithFourArgsTest {

    @Test
    public void calculateSolarPositionWithFourArgsTest() {
        ZonedDateTime mockedDateTime = Mockito.mock(ZonedDateTime.class);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(mockedDateTime, 10.5, 103.9, 67.8);

        assertNotNull(result);
        assertTrue(result instanceof AzimuthZenithAngle);
    }

}