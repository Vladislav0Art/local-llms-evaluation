package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionTestWithInvalidTemperature {

    @Test
    public void calculateSolarPositionTestWithInvalidTemperature() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = -275;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}