package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_NoRefractionTest {

    @Mock
    private ZoneOffset zoneOffset;

    @InjectMocks
    private Grena3 grena3;

    @Test
    public void calculateSolarPosition_NoRefractionTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, zoneOffset);
        double latitude = 45.0;
        double longitude = 10.0;
        double deltaT = 0.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(0.0, result.getAzimuth(), 0.01);
        assertEquals(0.0, result.getZenith(), 0.01);
    }

}