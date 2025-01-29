package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void testEstimateForValidDate_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForValidDate_NoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(1.0);
        assertEquals(2.23606797749979e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForInvalidDate_ThrowsIllegalArgumentException() {
        LocalDate forDate = null;
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForZeroDay_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForTwoDays_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(2.0);
        assertEquals(3.4641016154549017e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForTwoDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(2.0);
        assertEquals(3.4641016154549017e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForThreeDays_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForThreeDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(3.0);
        assertEquals(5.196152422706632e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForFourDays_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForFourDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(4.0);
        assertEquals(5.972383494949296e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForFiveDays_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForFiveDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(5.0);
        assertEquals(6.928515211949898e-17, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

    @Test
    public void testEstimateForOneDay_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}