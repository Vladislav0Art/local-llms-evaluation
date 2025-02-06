package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateDifferentDaysDeltaT {

    @Test
    public void estimateDifferentDaysDeltaT() {
        // Arrange
        LocalDate forDate1 = LocalDate.of(2022, 6, 1);
        LocalDate forDate2 = LocalDate.of(2022, 7, 15);

        // Act and Assert
        double result1 = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate1);
        double result2 = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate2);
        assertEquals(-12.4254, result1, 0.000001);
    }

}