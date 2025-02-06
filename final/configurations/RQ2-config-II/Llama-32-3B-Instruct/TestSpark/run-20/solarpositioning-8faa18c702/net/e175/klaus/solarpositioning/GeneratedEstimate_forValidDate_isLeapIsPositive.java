package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_forValidDate_isLeapIsPositive {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_forValidDate_isLeapIsPositive() {
        // given
        when(forDate.isLeapYear()).thenReturn(true);
        when(forDate.getMonthValue()).thenReturn(1);

        // when
        double result = DeltaT.estimate(forDate);

        // then
        assertTrue(result > 0);
    }

}