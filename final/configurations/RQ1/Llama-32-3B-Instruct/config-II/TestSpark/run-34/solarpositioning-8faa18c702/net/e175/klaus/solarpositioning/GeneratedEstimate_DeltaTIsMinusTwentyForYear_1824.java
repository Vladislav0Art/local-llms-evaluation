package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_DeltaTIsMinusTwentyForYear_1824 {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_DeltaTIsMinusTwentyForYear_1824() {
        LocalDate forDate = LocalDate.of(1824, 1, 1);
        double result = deltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow((-184) / 100, 2), result, 0.001);
    }

}