package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPositionNullDateTest() {
        ZonedDateTime date = null;
        double latitude = 35.6895;
        double longitude = 139.6917;
        double deltaT = 0.30;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}