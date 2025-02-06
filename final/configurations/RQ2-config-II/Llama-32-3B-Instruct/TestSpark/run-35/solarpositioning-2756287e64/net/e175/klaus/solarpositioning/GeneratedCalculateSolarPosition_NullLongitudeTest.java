package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_NullLongitudeTest {

    @Test
    public void calculateSolarPosition_NullLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, 40.0, null, 1.0));
    }

}