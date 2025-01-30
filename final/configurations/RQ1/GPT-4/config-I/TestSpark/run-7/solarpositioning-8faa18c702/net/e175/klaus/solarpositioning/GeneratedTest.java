package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void estimateAfter500BCTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 10583.6;
        assertEquals("Incorrect estimate for year -500", expected, estimate, 0.001);
    }

    @Test
    public void estimateMiddleOfFirstMilleniumTest() {
        LocalDate date = LocalDate.of(500, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 1574.2;
        assertEquals("Incorrect estimate for year 500", expected, estimate, 0.001);
    }

    @Test
    public void estimateMiddleOfSecondMilleniumTest() {
        LocalDate date = LocalDate.of(1600, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 120;
        assertEquals("Incorrect estimate for year 1600", expected, estimate, 0.001);
    }

    @Test
    public void estimateEndOfSecondMilleniumTest() {
        LocalDate date = LocalDate.of(1700, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 8.83;
        assertEquals("Incorrect estimate for year 1700", expected, estimate, 0.001);
    }

    @Test
    public void estimateAfterTwentyFirstCenturyTest() {
        LocalDate date = LocalDate.of(2150, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = -20;
        assertEquals("Incorrect estimate for year 2150", expected, estimate, 0.001);
    }

}