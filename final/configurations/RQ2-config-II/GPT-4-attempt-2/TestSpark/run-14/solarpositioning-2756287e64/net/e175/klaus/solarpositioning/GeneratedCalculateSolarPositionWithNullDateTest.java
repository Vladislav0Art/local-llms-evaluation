package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithNullDateTest {

    @Test
    public void calculateSolarPositionWithNullDateTest() {
        ZonedDateTime date = null;
        double latitude = 50.1109;
        double longitude = 8.6821;
        double deltaT = 68.8033;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}