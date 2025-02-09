package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionNullDateLatitudeLongitudeDeltaTPressureTemperatureTest {

    @Test
    public void calculateSolarPositionNullDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = null;
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;
        double pressure = 101.3;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}