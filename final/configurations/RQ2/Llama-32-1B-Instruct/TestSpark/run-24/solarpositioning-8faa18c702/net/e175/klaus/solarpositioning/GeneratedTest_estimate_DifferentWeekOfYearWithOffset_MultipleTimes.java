package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_estimate_DifferentWeekOfYearWithOffset_MultipleTimes {

    public final class LocalDateUtil {
        public static LocalDate get

        LocalDateFromEpochMillis(long epochMillis) {
            return null;
        }
    }

    @Test
    public void test_estimate_DifferentWeekOfYearWithOffset_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfWeek()).thenReturn(3); // second day of the week is Tuesday
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

}