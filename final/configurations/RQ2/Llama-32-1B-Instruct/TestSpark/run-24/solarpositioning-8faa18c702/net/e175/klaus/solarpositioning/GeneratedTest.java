package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    public final class LocalDateUtil {
        public static int getMonthFromEpoch(long epochMillis) {
            return 0;
        }
    }

    @Test
    public void test_estimate_Simple() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(1);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(10.0, result, 2);
    }

    @Test
    public void test_estimate_NoData() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(12);
        when(forDate.getMonthValue()).thenReturn(3); // April is the third month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

    @Test
    public void test_estimate_SameDay_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(1);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(10.0, result, 2);
    }

    @Test
    public void test_estimate_DifferentDay_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(12);
        when(forDate.getMonthValue()).thenReturn(6); // June is the sixth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

    @Test
    public void test_estimate_DifferentWeek_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(13);
        when(forDate.getMonthValue()).thenReturn(4); // April is the fourth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

    @Test
    public void test_estimate_DifferentWeekWithOffset_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getDayOfMonth()).thenReturn(3);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

    @Test
    public void test_estimate_DifferentMonth_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getMonthValue()).thenReturn(4); // April is the fourth month of the year
        when(forDate.getDayOfMonth()).thenReturn(20); // February is the twentieth day of the month
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

    @Test
    public void test_estimate_DifferentMonthWithOffset_MultipleTimes() throws Exception {
        final LocalDate forDate = mock(LocalDate.class);
        when(forDate.getMonthValue()).thenReturn(5); // May is the fifth month of the year
        when(forDate.getDayOfMonth()).thenReturn(20); // February is the twentieth day of the month
        when(forDate.getYear()).thenReturn(2024);
        final double result = new DeltaT().estimate(forDate);
        assertEquals(-1.0, result, 2);
    }

}