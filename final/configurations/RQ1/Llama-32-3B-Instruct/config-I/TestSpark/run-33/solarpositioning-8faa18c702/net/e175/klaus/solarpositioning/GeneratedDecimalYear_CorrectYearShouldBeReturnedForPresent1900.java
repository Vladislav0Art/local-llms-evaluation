package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito;

import java.time.LocalDate;

import static org.hamcrest.Matchers.closeTo;

public class GeneratedDecimalYear_CorrectYearShouldBeReturnedForPresent1900 {

    @Test
    public void decimalYear_CorrectYearShouldBeReturnedForPresent1900() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double year = DeltaT.decimalYear(date);
        assertThat(year, closeTo(1899.5, 0.1));
    }

}