package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateForFutureDateTest() {
        LocalDate futureDate = LocalDate.of(3000, 1, 1);
        double result = DeltaT.estimate(futureDate);
        assertEquals(3387.55, result, 0.001);
    }

    @Test
    public void estimateForPastDateTest() {
        LocalDate pastDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(pastDate);
        assertEquals(13.72, result, 0.001);
    }

    @Test
    public void estimateForPresentDateTest() {
        LocalDate presentDate = LocalDate.now();
        double result = DeltaT.estimate(presentDate);
        // The value may vary depending on the execution date, it's an approximation.
        assertEquals(69.71, result, 10.001);
    }

    @Test
    public void estimateForLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(leapYearDate);
        assertEquals(63.83, result, 0.001);
    }

    @Test
    public void estimateForNonLeapYearTest() {
        LocalDate nonLeapYearDate = LocalDate.of(1999, 1, 1);
        double result = DeltaT.estimate(nonLeapYearDate);
        assertEquals(63.83, result, 0.001);
    }

}