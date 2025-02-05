package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionTestWithInvalidLatitude {

    @Test
    public void calculateSolarPositionTestWithInvalidLatitude() {
        ZonedDateTime testDate = ZonedDateTime.of(2021, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 91.0, 13.4050, 70.0); // Latitude is over 90
    }

}