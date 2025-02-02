package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[

decimalYear_GivenDate_0Seconds_ReturnsCorrectDecimalYear {

    @Test
    public void [decimalYear_GivenDate_0Seconds_ReturnsCorrectDecimalYear() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double decimalYear = DeltaT.decimalYear(date);
        assertEquals(43.5, decimalYear, 0.00001);
    }

}