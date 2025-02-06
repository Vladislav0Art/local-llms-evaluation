package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateDeltaTZeroInput {

    @Test
    public void estimateDeltaTZeroInput() {
        // Arrange and Act
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(null);

        // Assert
        assertEquals(0, result, 0.000001);
    }

}