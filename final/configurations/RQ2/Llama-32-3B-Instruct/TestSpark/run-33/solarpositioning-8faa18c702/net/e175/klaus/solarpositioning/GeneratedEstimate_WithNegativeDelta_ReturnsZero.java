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
public class GeneratedEstimate_WithNegativeDelta_ReturnsZero {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_WithNegativeDelta_ReturnsZero() {
        when(forDate.atDay(-1)).thenReturn(LocalDate.of(2022, 12, 31));
        when(DeltaT.delta).thenReturn(-5);

        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.01);
    }

}