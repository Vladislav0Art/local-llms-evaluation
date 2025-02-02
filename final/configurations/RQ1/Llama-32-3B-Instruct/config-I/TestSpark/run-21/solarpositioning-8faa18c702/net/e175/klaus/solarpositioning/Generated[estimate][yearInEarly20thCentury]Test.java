package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[estimate][yearInEarly20thCentury]

Test {

    @Test
    public void [estimate][yearInEarly20thCentury]Test() {
        LocalDate forDate = LocalDate.of(1950, 6, 15);
        assertEquals(21.20 + 0.84493 * (19 - 1) / 12 - 0.076100 * pow((19 - 1) / 12, 2) + 0.0020936 * pow((19 - 1) / 12, 3), DeltaT.estimate(forDate), 0.00001);
    }

}