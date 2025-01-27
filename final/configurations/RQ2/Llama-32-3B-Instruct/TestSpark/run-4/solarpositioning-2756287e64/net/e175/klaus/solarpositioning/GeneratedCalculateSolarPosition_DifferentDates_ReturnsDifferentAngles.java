package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class GeneratedCalculateSolarPosition_DifferentDates_ReturnsDifferentAngles {

    @Test
    public void calculateSolarPosition_DifferentDates_ReturnsDifferentAngles() {
        ZonedDateTime date1 = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        ZonedDateTime date2 = ZonedDateTime.of(2022, 12, 22, 0, 0, 0, ZoneOffset.UTC);

        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle1 = Grena3.calculateSolarPosition(date1, latitude, longitude);
        AzimuthZenithAngle angle2 = Grena3.calculateSolarPosition(date2, latitude, longitude);

        assertNotEquals(angle1, angle2);
    }

}