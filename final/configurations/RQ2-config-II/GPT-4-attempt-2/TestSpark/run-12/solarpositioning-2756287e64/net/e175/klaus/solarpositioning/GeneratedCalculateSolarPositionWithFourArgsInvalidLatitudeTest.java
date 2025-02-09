package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithFourArgsInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithFourArgsInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 10, 12, 10, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 200;
        double longitude = 4.3517;
        double deltaT = 68.803;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}