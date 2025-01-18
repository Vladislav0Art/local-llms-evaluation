package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateWithNullDateTest {

    @Test
    public void estimateWithNullDateTest() {
        double result = DeltaT.estimate(null);
    }

}