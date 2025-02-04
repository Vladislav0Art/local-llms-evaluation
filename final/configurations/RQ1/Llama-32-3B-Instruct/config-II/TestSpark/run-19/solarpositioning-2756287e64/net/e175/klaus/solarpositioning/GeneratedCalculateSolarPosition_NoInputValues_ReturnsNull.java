package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_NoInputValues_ReturnsNull {

    @Mock
    private G Rena3
    grena3;

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @Mock
    private JulianDate julianDate;

    @Mock
    private DeltaT deltaT;

    @Mock
    private Pressure pressure;

    @Mock
    private Temperature temperature;

    @Test
    public void calculateSolarPosition_NoInputValues_ReturnsNull() {
        OptionalDouble result = grena3.calculateSolarPosition(null, null, null);
        assertNull(result);
    }

}