package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearAfter1600ButBefore1700 {

    @Test
    public void EstimateDeltaT_YearAfter1600ButBefore1700() {
        final LocalDate forDate = LocalDate.of(1619, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(120 - 0.9808 * (forDate.getYear() - 1600) - 0.01532 * pow((forDate.getYear() - 1600), 2) + pow((forDate.getYear() - 1600), 3) / 7129,
                deltaT, 0.001);
    }

}