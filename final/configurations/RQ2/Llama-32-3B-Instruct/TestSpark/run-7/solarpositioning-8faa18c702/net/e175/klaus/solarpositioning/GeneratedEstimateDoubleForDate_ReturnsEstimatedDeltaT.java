package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedEstimateDoubleForDate_ReturnsEstimatedDeltaT {

    @Test
    public void estimateDoubleForDate_ReturnsEstimatedDeltaT() {
        LocalDate forDate = LocalDate.of(2022, 6, 15);
        double expectedDeltaT = 1.0; // Replace with actual expected value
        double actualDeltaT = DeltaT.estimate(forDate);
        assertThat(actualDeltaT, is(expectedDeltaT));
    }

}