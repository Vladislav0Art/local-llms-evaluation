package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearAfter1700ButBefore1800 {

    @Test
    public void EstimateDeltaT_YearAfter1700ButBefore1800() {
        final LocalDate forDate = LocalDate.of(1719, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(8.83 + 0.1603 * (forDate.getYear() - 1700) - 0.0059285 * pow((forDate.getYear() - 1700), 2)
                        + 0.00013336 * pow((forDate.getYear() - 1700), 3) - pow((forDate.getYear() - 1700), 4) / 7129,
                deltaT, 0.001);
    }

}