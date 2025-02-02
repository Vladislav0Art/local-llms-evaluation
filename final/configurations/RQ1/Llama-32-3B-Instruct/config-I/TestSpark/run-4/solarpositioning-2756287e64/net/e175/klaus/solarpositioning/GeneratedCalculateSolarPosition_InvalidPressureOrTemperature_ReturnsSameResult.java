package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_InvalidPressureOrTemperature_ReturnsSameResult {

    private Grena3 grena3;

    @Before
    public void setUp() {
        grena3 = new Grena3();
    }

    @Test
    public void calculateSolarPosition_InvalidPressureOrTemperature_ReturnsSameResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double deltaT = 0.1;
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, Double.NaN, Double.NaN, -9999.0);
        assertEquals(result.getElevation(), -9999.0, 0.01);
    }

}