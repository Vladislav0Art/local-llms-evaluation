package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_MultipleTimesOnSameDayTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_MultipleTimesOnSameDayTest() {
        for (int i = 0; i < 100; i++) {
            double result = DeltaT.estimate(forDate);
            // Check the logic of the estimate method here.
        }
    }

}