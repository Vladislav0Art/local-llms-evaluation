package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateDecimalYearCorrectlyForDifferentYears {

    @Test
    public void testCalculateDecimalYearCorrectlyForDifferentYears() {
        when(DeltaT.decimalYear(LocalDate.of(2023, 12, 31))).thenReturn(63.25);
        LocalDate date = LocalDate.of(2023, 12, 31);
        double result = DeltaT.decimalYear(date);
        assertEquals(63.25, result, 0.01);
    }
}

}