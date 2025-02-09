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
public class GeneratedEstimate_WhenForDateIsAfterLastDayOfYear_ReturnsPositiveInfinity {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_WhenForDateIsAfterLastDayOfYear_ReturnsPositiveInfinity() {
        when(forDate.atDay((int) LocalDate.of(2022, 12, 31).plusDays(1))).thenReturn(LocalDate.of(2023, 1, 1));

        double result = DeltaT.estimate(forDate);
        assertNotEquals(Double.NEGATIVE_INFINITY, result);
    }

}