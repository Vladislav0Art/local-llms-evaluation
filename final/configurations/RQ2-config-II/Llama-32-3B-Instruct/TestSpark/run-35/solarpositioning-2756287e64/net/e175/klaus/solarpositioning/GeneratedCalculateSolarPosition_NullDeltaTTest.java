package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_NullDeltaTTest {

    @Test
    public void calculateSolarPosition_NullDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, 40.0, 20.0, null));
    }

}