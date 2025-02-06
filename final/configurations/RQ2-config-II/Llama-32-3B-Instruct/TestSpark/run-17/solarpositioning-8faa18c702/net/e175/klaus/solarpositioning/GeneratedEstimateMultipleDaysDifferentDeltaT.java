package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateMultipleDaysDifferentDeltaT {

    @Test
    public void estimateMultipleDaysDifferentDeltaT() {
        // Arrange
        LocalDate forDate1 = LocalDate.of(2022, 6, 1);
        LocalDate forDate2 = LocalDate.of(2022, 7, 15);

        // Act and Assert
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate1);
        assertEquals(-12.4254, result, 0.000001);
    }

}