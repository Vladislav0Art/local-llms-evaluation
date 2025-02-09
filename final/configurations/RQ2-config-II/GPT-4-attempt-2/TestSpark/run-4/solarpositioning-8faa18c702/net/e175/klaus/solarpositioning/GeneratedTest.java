package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2030, 1, 1);
        double result = DeltaT.estimate(futureDate);
        // assert according to your known result here.
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1960, 1, 1);
        double result = DeltaT.estimate(pastDate);
        // assert according to your known result here.
    }

    @Test
    public void estimateWithLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2000, 2, 29);
        double result = DeltaT.estimate(leapYearDate);
        // assert according to your known result here.
    }

}