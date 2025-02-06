package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_DeltaTOnWeekendTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_DeltaTOnWeekendTest() {
        // Test that an appropriate exception is thrown when estimating delta T on a weekend.
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(forDate));
    }

}