package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_forValidDate_isNotLeapIsNegative {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_forValidDate_isNotLeapIsNegative() {
        // given
        when(forDate.isLeapYear()).thenReturn(false);
        when(forDate.getMonthValue()).thenReturn(3);

        // when
        double result = DeltaT.estimate(forDate);

        // then
        assertTrue(result < 0);
    }

}