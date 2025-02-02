package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimateExactDateWithLeapDay {

    private int decimalYear(LocalDate date) {
        // Implementation of the method to get the decimal year
        return 0;
    }

    public static double estimate(LocalDate date) {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(0);
        double result = (date.getYear() - 1582 + 474) * 365.2425;

        if ((date.getMonthValue() > 12 ||
                (date.getMonthValue() == 12 && date.getDayOfMonth() >= 31)) &&
                date.getDayOfWeek().getValue() == 7) {
            result += (0.000016;
        }

        return result;
    }
}

public class DeltaTTest {

    @Test
    public void testEstimateExactDateWithLeapDay() {
        LocalDate date = new LocalDate(1000, 12, 29);
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(-500);
        double result = DeltaT.estimate(date);
        assertEquals(10583.7, result, 1e-10);
    }

}