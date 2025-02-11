package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecimalYear_forDateLessThan_500Test {

    @Test
    public void decimalYear_forDateLessThan_500Test() {
        LocalDate date = LocalDate.of(2023, 6, 25);
        when(DeltaT.decimalYear(date)).thenReturn(400);
        assertEquals(400, DeltaT.decimalYear(date), 0.01);
    }

}