package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_DeltaTLargeValue_ThrowsException {

    @Test
    public void calculateSolarPosition_DeltaTLargeValue_ThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), 0.0, 0.0, Double.POSITIVE_INFINITY));
    }

}