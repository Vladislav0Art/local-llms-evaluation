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
public class GeneratedCalculateSolarPosition_EmptyDates_ReturnsNull {

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
    public void calculateSolarPosition_EmptyDates_ReturnsNull() {
        ZonedDateTime date1 = ZonedDateTime.of(2022, 1, 1, 0, 0, 0);
        ZonedDateTime date2 = ZonedDateTime.of(2022, 12, 31, 23, 59, 59);

        when(grena3.calcT(date1)).thenReturn(0.0);
        when(grena3.calcT(date2)).thenReturn(0.0);

        OptionalDouble result1 = grena3.calculateSolarPosition(date1, null, null);
        OptionalDouble result2 = grena3.calculateSolarPosition(null, date2, null);

        assertNull(result1);
        assertNull(result2);
    }

}