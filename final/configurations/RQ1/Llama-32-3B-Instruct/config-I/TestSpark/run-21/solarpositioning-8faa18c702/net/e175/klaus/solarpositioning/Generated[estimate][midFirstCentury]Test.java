package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[estimate][midFirstCentury]

Test {

    @Test
    public void [estimate][midFirstCentury]Test() {
        LocalDate forDate = LocalDate.of(1805, 6, 15);
        assertEquals(8.83 + 0.1603 * (18 - 1) / 12 - 0.0059285 * pow((18 - 1) / 12, 2), DeltaT.estimate(forDate), 0.00001);
    }

}