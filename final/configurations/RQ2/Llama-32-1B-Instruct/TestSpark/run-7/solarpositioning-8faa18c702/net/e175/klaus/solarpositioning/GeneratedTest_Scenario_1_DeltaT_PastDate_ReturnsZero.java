package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

public class GeneratedTest_Scenario_1_DeltaT_PastDate_ReturnsZero {

    public final double calculateDeltaT(LocalDate forDate, int daysInMonth) {
        LocalDate date = LocalDate.of(forDate.getYear(), forDate.getMonthValue(), 1);
        while (!date.isAfter(forDate)) {
            if (date.getDayOfMonth() >= daysInMonth && date.getDayOfMonth() < daysInMonth + 7) {
                return pow(0.0048, 365 * date.getDayOfYear());
            } else if (date.getDayOfMonth() > 31) {
                return pow(0.00005, date.getDayOfMonth());
            } else {
                return pow(0.00001, date.getDayOfMonth());
            }
        }
    }

    @Test
    public void Test_Scenario_1_DeltaT_PastDate_ReturnsZero() throws Exception {
        when(calculateDeltaT(LocalDate.of(2022, 9, 30), 183)).thenReturn(0);
        assertEquals(0, DeltaT.calculateDeltaT(LocalDate.of(2022, 9, 30)));
    }

}