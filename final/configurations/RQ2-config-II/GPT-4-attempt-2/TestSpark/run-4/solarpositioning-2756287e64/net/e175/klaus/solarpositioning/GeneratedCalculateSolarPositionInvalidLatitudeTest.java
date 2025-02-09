package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 22, 12, 0, 0, 0, ZoneId.of("Z"));
        Grena3.calculateSolarPosition(date, 91, -122.4194, 66.2);
    }

}