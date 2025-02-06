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
public class GeneratedEstimate_GivenCustomForDate_ReturnsExpected {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_GivenCustomForDate_ReturnsExpected() {
        when(forDate).thenReturn(LocalDate.of(2022, 1, 1));
        double result = deltaT.estimate(forDate);
        assertEquals(12.4, result, 0.01);
    }

}