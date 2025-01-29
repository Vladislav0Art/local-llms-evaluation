package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTest {

    @Test
    public void TestEstimate_SingleMinute() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 60.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleMinutes() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 120.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_TwoDays() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 1440.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_TwoWeeks() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 604800.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleMonths() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 12.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleYears() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 8760.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_TwelveMonths() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 365.25, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleYearsWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 8760.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().minusDays(365));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_SingleMinuteWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 60.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-2));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleMinutesWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 120.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-2));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_TwoDaysWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 1440.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-2));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_TwoWeeksWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 604800.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-14));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleMonthsWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 12.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-84));
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestEstimate_MultipleYearsWithOffset() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 8760.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate.toInstant().plusDays(-365));
        assertEquals(expectedValue, actualValue);
    }

}