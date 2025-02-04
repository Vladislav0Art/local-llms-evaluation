package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_DeltaT_ValuesIsBetweenMinusInfinityAndPlusInfinity() {
        assertTrue(Double.isInfinite(deltaT.estimate(forDate)));
    }

    @Test
    public void estimate_NoLeapYear_Around2000() {
        LocalDate forDate = LocalDate.of(2001, 1, 1);
        double result = deltaT.estimate(forDate);
        assertEquals(-23.933, result, 0.001);
    }

    @Test
    public void testNoLeapYearBefore1900() {
        LocalDate forDate = LocalDate.of(1899, 1, 1);
        double result = deltaT.estimate(forDate);
        assertTrue(Double.isInfinite(result));
    }

    @Test
    public void estimate_Year2004_DeltaTIsPlusValue() {
        LocalDate forDate = LocalDate.of(2004, 1, 1);
        double result = deltaT.estimate(forDate);
        assertTrue(result > 0);
    }

    @Test
    public void estimate_NegativeDeltaTFor1900_Year() {
        LocalDate forDate = LocalDate.of(-1899, 1, 1);
        double result = deltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow((-1888) / 100, 2), result, 0.001);
    }

    @Test
    public void estimate_DeltaTIsMinusTwentyForYear_1824() {
        LocalDate forDate = LocalDate.of(1824, 1, 1);
        double result = deltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow((-184) / 100, 2), result, 0.001);
    }

    @Test
    public void testYearBeforeAndAfterDeltaT() {
        LocalDate forDate = LocalDate.of(1909, 1, 1);
        double result = deltaT.estimate(forDate);
        assertEquals(-23.933, result, 0.001);
    }

}