package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionGivesCorrectZenithAngleForKnownDateTimeTest {

    @Test
    public void calculateSolarPositionGivesCorrectZenithAngleForKnownDateTimeTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 5, 30, 12, 0, 0, 0, ZoneId.of("GMT"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 52.5200, 13.4050, 70.0);
        assertEquals(39.25, result.getZenithAngle(), 0.01);
    }

}