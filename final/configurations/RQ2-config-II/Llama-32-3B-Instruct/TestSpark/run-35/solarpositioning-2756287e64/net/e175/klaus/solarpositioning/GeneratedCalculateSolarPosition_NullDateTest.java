package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_NullDateTest {

    @Test
    public void calculateSolarPosition_NullDateTest() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 40.0, 20.0, 1.0));
    }

}