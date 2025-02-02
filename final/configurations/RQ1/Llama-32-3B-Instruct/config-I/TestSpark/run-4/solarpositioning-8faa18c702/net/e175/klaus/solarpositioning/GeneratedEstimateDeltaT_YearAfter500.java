package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearAfter500 {

    @Test
    public void EstimateDeltaT_YearAfter500() {
        final LocalDate forDate = LocalDate.of(501, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), deltaT, 0.001);
    }

}