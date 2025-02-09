package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_NoDateTest {

    @Test
    public void calculateSolarPosition_NoDateTest() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(null, 0, 0, 0));
    }

}