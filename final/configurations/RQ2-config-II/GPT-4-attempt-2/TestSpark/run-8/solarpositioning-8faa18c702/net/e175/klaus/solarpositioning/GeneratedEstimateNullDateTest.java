package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        double result = DeltaT.estimate(null);
    }

}