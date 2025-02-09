package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNullDateTest {

    @Test
    public void calculateSolarPositionWithNullDateTest() {
        Grena3.calculateSolarPosition(null, 42, 20, 60);
    }

}