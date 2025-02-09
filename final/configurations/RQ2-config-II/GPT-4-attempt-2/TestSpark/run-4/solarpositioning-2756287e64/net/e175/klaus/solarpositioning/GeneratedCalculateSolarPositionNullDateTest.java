package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPositionNullDateTest() {
        Grena3.calculateSolarPosition(null, 37.7749, -122.4194, 66.2);
    }

}