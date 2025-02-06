package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_GivenDefaultForDate_ReturnsExpected {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_GivenDefaultForDate_ReturnsExpected() {
        when(forDate).toReturn(LocalDate.now());
        double result = deltaT.estimate(forDate);
        assertEquals(0, result, 0.01); // Using a small delta for comparison due to floating-point precision issues
    }

}