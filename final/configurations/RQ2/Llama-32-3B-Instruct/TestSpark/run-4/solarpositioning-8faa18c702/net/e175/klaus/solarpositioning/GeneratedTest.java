package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaTForAnyDateReturnsZero() {
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result);
    }

    @Test
    public void estimateDeltaTEqualForSameDayOnDifferentYears() {
        LocalDate forDate1 = LocalDate.now().plusDays(-10).withYear(2023);
        LocalDate forDate2 = LocalDate.now().plusDays(-10).withYear(2024);
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(result1, result2);
    }

}