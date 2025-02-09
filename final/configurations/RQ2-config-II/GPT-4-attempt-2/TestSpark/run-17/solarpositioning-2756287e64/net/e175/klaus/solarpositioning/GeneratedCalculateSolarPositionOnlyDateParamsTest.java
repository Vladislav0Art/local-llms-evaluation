package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionOnlyDateParamsTest {

    @Test
    public void calculateSolarPositionOnlyDateParamsTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 10, 10, 10, 10, 10, 10, ZoneId.of("UTC"));
        double latitude = 46.0;
        double longitude = 7.0;
        double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
        //assert...
    }

}