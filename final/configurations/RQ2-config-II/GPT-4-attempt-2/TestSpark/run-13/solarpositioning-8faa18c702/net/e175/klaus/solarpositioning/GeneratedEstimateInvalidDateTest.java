package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateInvalidDateTest {

    @Test
    public void estimateInvalidDateTest() {
        // This date is beyond the valid range of Delta T calculations
        LocalDate date = LocalDate.of(1500, Month.JANUARY, 1);

        DeltaT.estimate(date);
    }

}