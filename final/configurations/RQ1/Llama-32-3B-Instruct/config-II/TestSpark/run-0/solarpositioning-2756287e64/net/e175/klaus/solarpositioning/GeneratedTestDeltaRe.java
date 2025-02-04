package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDeltaRe {

    @Mock
    private JulianDate julianDate;

    @Mock
    private DeltaT deltaT;

    @Mock
    private AzimuthZenithAngle azimutZenithAngle;

    public static final double LONGITUDE = 8.5;
    public static final double LATITUDE = 52.4;
    public static final ZonedDateTime DATE = ZonedDateTime.now();
    public static final double PRESSURE = 1013.2;
    public static final double TEMPERATURE = 20.1;

    @Test
    public void testDeltaRe() {
        assertTrue(Grena3.deltaRe(PRESSURE, TEMPERATURE));
    }

}