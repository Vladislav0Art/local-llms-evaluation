package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionTestWithInvalidLongitude {

    @Test
    public void calculateSolarPositionTestWithInvalidLongitude() {
        ZonedDateTime testDate = ZonedDateTime.of(2021, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52.5200, -181.0, 70.0); // Longitude is over 180 or below -180
    }

}