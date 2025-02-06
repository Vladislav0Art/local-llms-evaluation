package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_isNaN_forNullInput() {
        assertFalse(deltaT.estimate(null));
    }

    @Test
    public void estimate_isNaN_forEmptyInput() {
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(null);
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

    @Test
    public void estimate

    ReturnsCorrectResultForNonLeapYear_WithinSolarMonth() {
        LocalDate date = LocalDate.of(2020, 12, 15);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("1.5644", String.format("%.6f", result), 0.001);
    }

    @Test
    public void estimate

    ReturnsCorrectResultForNonLeapYear_JustBeforeSolarMonth() {
        LocalDate date = LocalDate.of(2020, 12, 10);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("2.2445", String.format("%.6f", result), 0.001);
    }

    @Test
    public void estimate

    ReturnsCorrectResultForLeapYear_WithinSolarMonth() {
        LocalDate date = LocalDate.of(2021, 12, 15);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("1.5645", String.format("%.6f", result), 0.001);
    }

    @Test
    public void estimate

    ReturnsCorrectResultForLeapYear_JustBeforeSolarMonth() {
        LocalDate date = LocalDate.of(2021, 12, 10);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("2.2446", String.format("%.6f", result), 0.001);
    }

    @Test
    public void estimate

    ReturnsNaN_ForSolarDayOutsidesMonth() {
        LocalDate date = LocalDate.of(2021, 12, 30);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

    @Test
    public void estimate

    ReturnsNaN_ForLeapDay() {
        LocalDate date = LocalDate.of(2021, 12, 31);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

    @Test
    public void estimate

    ReturnsNaN_ForMonthOutsidesLeapYearSolarMonth() {
        LocalDate date = LocalDate.of(2020, 12, 30);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

    @Test
    public void estimate

    ReturnsNaN_ForYearOutsidesLeapYearSolarMonth() {
        LocalDate date = LocalDate.of(2021, 12, 31);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

}