package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_SingleDate_LatitudePositiveLongitudeNegative_DeltaTZero_ReturnsCorrectAngle {

    @Test
    public void calculateSolarPosition_SingleDate_LatitudePositiveLongitudeNegative_DeltaTZero_ReturnsCorrectAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = -100.0;
        double deltaT = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        // TODO: implement test
    }

}