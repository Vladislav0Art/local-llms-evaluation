package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateMidYearDayTest {

    @Test
    public void estimateMidYearDayTest() {
        LocalDate midYearDay = LocalDate.of(2021, 7, 2);
        double result = DeltaT.estimate(midYearDay);
        assertEquals(71.07200336660486, result, 0.001);
    }

}