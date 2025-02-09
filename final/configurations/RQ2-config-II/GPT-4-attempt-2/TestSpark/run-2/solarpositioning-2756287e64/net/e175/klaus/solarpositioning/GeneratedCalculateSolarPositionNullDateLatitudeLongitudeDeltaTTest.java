package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionNullDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionNullDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = null;
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}