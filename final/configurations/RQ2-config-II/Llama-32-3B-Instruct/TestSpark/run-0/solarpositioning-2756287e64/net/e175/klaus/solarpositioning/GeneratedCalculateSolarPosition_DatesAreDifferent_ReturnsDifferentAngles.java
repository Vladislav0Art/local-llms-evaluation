package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_DatesAreDifferent_ReturnsDifferentAngles {

    @Test
    public void calculateSolarPosition_DatesAreDifferent_ReturnsDifferentAngles() {
        ZonedDateTime date1 = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime date2 = ZonedDateTime.now(ZoneOffset.UTC).plusDays(1);

        AzimuthZenithAngle angle1 = Grena3.calculateSolarPosition(date1, 0.0, 0.0, 0.0);
        AzimuthZenithAngle angle2 = Grena3.calculateSolarPosition(date2, 0.0, 0.0, 0.0);

        AssertNotEquals(angle1, angle2);
    }

}