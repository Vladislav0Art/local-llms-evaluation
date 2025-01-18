package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedCalculateSolarPositionWithFourParamsInvalidLatTest {

    @Test
    public void calculateSolarPositionWithFourParamsInvalidLatTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 98.21;
        double longitude = 16.37;
        double deltaT = 69;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}