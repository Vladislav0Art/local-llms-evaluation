package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -100.0;
        double longitude = 144.96;
        double deltaT = 70;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}