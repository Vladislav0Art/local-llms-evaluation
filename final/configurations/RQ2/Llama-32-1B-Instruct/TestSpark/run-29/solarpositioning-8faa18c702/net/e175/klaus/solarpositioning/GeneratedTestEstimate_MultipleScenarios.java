package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedTestEstimate_MultipleScenarios {

    @Mock
    private LocalDate mockForDate;

    public void testEstimate_SingleScenario() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = getDeltaT().estimate(forDate.toEpochDay());
        assertEquals(6.0, result, 1e-8);
    }

    @Test
    public void testEstimate_MultipleScenarios() {
        LocalDate[] forDates = new LocalDate[]{LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1)};
        double totalResult = getDeltaT().estimate(forDates);
        assertEquals(24.0, totalResult, 1e-8);
    }

    public DeltaT getDeltaT() {
        return new DeltaT(mockForDate);
    }
}

class DeltaT {

    private LocalDate forDate;

    public DeltaT(LocalDate forDate) {
        this.forDate = forDate;
    }

    public double estimate(LocalDate... dates) {
        double result = 0.0;
        for (LocalDate date : dates) {
            if (!date.isEqual(forDate)) {
                result += date.distanceTo(forDate);
            }
        }
        return result;
    }

}