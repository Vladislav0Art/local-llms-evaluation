package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate InvalidDate_ReturnsInfinity {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate

    InvalidDate_ReturnsInfinity() {
        // given
        when(forDate.isLeapDay()).thenReturn(true);

        // when
        double result = DeltaT.estimate(forDate);

        // then
        assertTrue(Double.isInfinite(result));
    }

}