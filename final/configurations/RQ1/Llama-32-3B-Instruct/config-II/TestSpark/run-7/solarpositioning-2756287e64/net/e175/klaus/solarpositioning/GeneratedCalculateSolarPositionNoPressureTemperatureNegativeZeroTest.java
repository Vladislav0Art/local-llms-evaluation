package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCalculateSolarPositionNoPressureTemperatureNegativeZeroTest {

    @Mock
    private Grena3 grena3Instance;

    @Test
    public void calculateSolarPositionNoPressureTemperatureNegativeZeroTest() {
        AzimuthZenithAngle result = grena3Instance.calculateSolarPosition(ZonedDateTime.now(), 0, 0, 0);
        assertTrue(result.getAzimuth().equals(0.0));
        assertTrue(result.getZenith().equals(0.0));
    }

}