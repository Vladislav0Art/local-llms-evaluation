package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateForDate_ReturnsCorrectDeltaT {

    @Mock
    private List<Double> sunHourAngleList;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimateForDate_ReturnsCorrectDeltaT() {
        when(sunHourAngleList.get(0)).thenReturn(10.0);
        when(sunHourAngleList.get(1)).thenReturn(15.0);

        double result = deltaT.estimate(LocalDate.now());
        assertEquals(12.5, result, 1e-9);
    }

}