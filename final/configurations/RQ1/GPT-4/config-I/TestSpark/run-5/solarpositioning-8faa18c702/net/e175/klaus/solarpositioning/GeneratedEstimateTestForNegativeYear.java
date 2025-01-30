package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForNegativeYear {

    @Test
    public void estimateTestForNegativeYear() {
        LocalDate date = LocalDate.of(-1000, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(-470.4, result, 0.01);
    }

}