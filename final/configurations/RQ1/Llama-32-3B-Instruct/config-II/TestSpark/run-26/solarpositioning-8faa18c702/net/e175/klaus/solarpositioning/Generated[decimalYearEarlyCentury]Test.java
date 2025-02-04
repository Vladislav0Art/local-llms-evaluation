package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[decimalYearEarlyCentury]

Test {

    @Test
    public void [decimalYearEarlyCentury]Test() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.decimalYear(date);
        assertEquals((double) (date.getYear() + (date.getMonthValue() - 0.5) / 12), result, 0.001);
    }

}