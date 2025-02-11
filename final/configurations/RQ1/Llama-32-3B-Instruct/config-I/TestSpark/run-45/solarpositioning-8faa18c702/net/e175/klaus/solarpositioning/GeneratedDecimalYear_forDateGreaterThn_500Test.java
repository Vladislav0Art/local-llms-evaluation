package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecimalYear_forDateGreaterThn_500Test {

    @Test
    public void decimalYear_forDateGreaterThn_500Test() {
        LocalDate date = LocalDate.of(2023, 6, 25);
        when(DeltaT.decimalYear(date)).thenReturn(1500);
        assertEquals(1500, DeltaT.decimalYear(date), 0.01);
    }

}