package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimate_PresentDateTest {

    @Test
    public void estimate_PresentDateTest() {
        LocalDate date = LocalDate.of(2022, 9, 22);
        double deltaT = DeltaT.estimate(date);
        Assert.assertEquals(50.288, deltaT, 0.0001);
    }

}