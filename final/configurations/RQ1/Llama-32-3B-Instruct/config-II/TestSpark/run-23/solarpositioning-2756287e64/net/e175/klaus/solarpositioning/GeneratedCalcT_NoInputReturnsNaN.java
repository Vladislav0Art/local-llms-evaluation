package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalcT_NoInputReturnsNaN {

    @Test
    public void calcT_NoInputReturnsNaN() {
        final ZonedDateTime date = null;
        final double result = Grena3.calcT(date);
        assertTrue(Double.isNaN(result));
    }

}