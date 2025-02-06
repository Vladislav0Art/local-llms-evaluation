package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_NullLatitudeTest {

    @Test
    public void calculateSolarPosition_NullLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, null, 20.0, 1.0));
    }

}