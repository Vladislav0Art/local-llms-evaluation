package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateDecimalYearCorrectlyForDifferentMonths {

    @Test
    public void calculateDecimalYearCorrectlyForDifferentMonths() {
        LocalDate date = LocalDate.of(2023, 6, 15);
        double result = DeltaT.decimalYear(date);
        assertEquals(57.25, result, 0.01);
    }
}

}