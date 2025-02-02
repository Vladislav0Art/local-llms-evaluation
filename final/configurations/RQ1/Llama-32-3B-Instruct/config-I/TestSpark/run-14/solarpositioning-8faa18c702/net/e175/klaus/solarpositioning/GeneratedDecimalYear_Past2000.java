package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedDecimalYear_Past2000 {

    @Test
    public void decimalYear_Past2000() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(-150.5, deltaT.decimalYear(forDate), 0.01);
    }

}