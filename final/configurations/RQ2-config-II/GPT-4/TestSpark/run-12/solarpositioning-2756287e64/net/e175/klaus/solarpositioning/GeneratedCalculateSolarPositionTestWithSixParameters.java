package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionTestWithSixParameters {

    @Test
    public void calculateSolarPositionTestWithSixParameters() {
        ZonedDateTime testDate = ZonedDateTime.of(2022, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 52.5200, 13.4050, 70.0, 1013, 25);

        assertNotNull(result);
    }

}