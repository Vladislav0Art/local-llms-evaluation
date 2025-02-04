package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecimalYear {

    @Test
    public void testDecimalYear() {
        LocalDate forDate = LocalDate.of(2000, 6, 15);
        assertEquals(2000.5, DeltaT.decimalYear(forDate), 0.01);
    }

}