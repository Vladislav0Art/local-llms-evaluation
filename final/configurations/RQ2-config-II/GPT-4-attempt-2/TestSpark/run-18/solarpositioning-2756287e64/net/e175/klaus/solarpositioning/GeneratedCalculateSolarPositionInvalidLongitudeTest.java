package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 200.0;
        double deltaT = 70;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}