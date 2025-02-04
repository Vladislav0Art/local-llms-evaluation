package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimateForDateLateMiddleCentury]

Test {

    @Test
    public void [estimateForDateLateMiddleCentury]Test() {
        LocalDate date = LocalDate.of(2005, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), result, 0.001);
    }

}