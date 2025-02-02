package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito;

import java.time.LocalDate;

import static org.hamcrest.Matchers.closeTo;

public class GeneratedDecimalYear_CorrectYearShouldBeReturnedForPast1900 {

    @Test
    public void decimalYear_CorrectYearShouldBeReturnedForPast1900() {
        LocalDate date = LocalDate.of(-1899, 1, 1);
        double year = DeltaT.decimalYear(date);
        assertThat(year, closeTo(1889.5, 0.1));
    }

}