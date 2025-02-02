package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearBefore1600 {

    @Test
    public void EstimateDeltaT_YearBefore1600() {
        final LocalDate forDate = LocalDate.of(-1599, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(1574.2 - 556.01 * ((forDate.getYear() - 1000) / 100) + 71.23472 * pow(((forDate.getYear() - 1000) / 100), 2),
                deltaT, 0.001);
    }

}