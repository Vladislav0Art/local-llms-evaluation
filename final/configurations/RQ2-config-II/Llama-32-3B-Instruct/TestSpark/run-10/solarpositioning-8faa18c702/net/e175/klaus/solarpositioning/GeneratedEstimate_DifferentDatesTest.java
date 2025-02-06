package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_DifferentDatesTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_DifferentDatesTest() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(1);
        double result1 = DeltaT.estimate(date1);
        double result2 = DeltaT.estimate(date2);
        // Check the logic of the estimate method here.
    }

}