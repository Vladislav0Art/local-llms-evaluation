package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_NoArguments_ReturnsNull {

    @Test
    public void calculateSolarPosition_NoArguments_ReturnsNull() {
        assertEquals(null, Grena3.calculateSolarPosition(null));
    }

}