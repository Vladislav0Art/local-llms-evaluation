package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        double deltaT = DeltaT.estimate(LocalDate.now());
        // Assert with known value for current date
    }

}