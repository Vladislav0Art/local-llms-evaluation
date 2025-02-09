package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_WithPositiveDelta_ReturnsNonNegativeInfinity {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_WithPositiveDelta_ReturnsNonNegativeInfinity() {
        when(forDate.atDay(1)).thenReturn(LocalDate.of(2022, 1, 1));
        when(DeltaT.delta).thenReturn(5);

        double result = DeltaT.estimate(forDate);
        assertNotEquals(Double.NEGATIVE_INFINITY, result);
    }

}