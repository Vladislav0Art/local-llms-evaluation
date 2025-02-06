package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPositionWithDateAndPressureReturnsAzimuthAndZEnith {

    @Test
    public void calculateSolarPositionWithDateAndPressureReturnsAzimuthAndZEnith() {
        G Rena3 grena3 = new G Rena3();
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).plusSeconds(10L);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 101325;

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);

        assertNotNull(result);
    }

}