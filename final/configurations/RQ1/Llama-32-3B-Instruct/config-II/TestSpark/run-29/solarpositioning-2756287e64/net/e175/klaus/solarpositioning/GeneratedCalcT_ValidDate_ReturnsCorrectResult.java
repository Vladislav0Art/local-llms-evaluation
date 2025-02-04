package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalcT_ValidDate_ReturnsCorrectResult {

    @Test
    public void calcT_ValidDate_ReturnsCorrectResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double t = Grena3.calcT(date);

        assertEquals(36525.0, t, 0.01);
    }

}