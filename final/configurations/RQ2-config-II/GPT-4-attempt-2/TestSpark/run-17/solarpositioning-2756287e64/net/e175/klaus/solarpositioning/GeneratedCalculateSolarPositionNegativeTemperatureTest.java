package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionNegativeTemperatureTest {

    @Test
    public void calculateSolarPositionNegativeTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 10, 10, 10, 10, 10, 10, ZoneId.of("UTC"));
        Grena3.calculateSolarPosition(date, 46.0, 7.0, 69.0, 1013.0, -1.0);
    }

}