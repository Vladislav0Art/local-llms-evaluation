package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTest {

    @Test
    public void testEstimate_NoTimeRange() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        assertEquals(Double.NaN, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimate_SinglePoint() {
        LocalDate forDate = LocalDate.of(2024, 3, 16);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimate_SinglePoint_Miscellaneous() {
        LocalDate forDate = LocalDate.of(2024, 3, 16);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimate_GapBetweenPoints() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).addDays(-3).subtractDays(3));
    }

    @Test
    public void testEstimate_SinglePoint_Miscellaneous_NoGap() {
        LocalDate forDate = LocalDate.of(2024, 3, 16);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimate_GapBetweenPoints_Miscellaneous() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).addDays(-3));
    }

    @Test
    public void testEstimate_GapBetweenPoints_Miscellaneous_NoGap() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).minusDays(3));
    }

    @Test
    public void testEstimate_MultiplePoints() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).addDays(-3).subtractDays(3));
    }

    @Test
    public void testEstimate_MultiplePoints_NoGap() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).minusDays(3));
    }

    @Test
    public void testEstimate_GapBetweenPoints_MultiplePoints() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).addDays(-3).addDays(10));
    }

    @Test
    public void testEstimate_GapBetweenPoints_MultiplePoints_NoGap() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).minusDays(3));
    }

}