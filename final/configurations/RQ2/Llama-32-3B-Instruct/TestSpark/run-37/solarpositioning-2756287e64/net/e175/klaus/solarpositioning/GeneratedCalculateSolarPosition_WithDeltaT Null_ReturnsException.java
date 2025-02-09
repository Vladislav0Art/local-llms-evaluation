package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_WithDeltaT Null_ReturnsException {

    @Test
    public void calculateSolarPosition_WithDeltaT

    Null_ReturnsException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0.0, 0.0, null));
    }

}