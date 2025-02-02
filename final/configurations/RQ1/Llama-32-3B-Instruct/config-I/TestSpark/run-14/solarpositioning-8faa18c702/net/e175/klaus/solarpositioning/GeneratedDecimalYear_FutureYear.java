package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedDecimalYear_FutureYear {

    @Test
    public void decimalYear_FutureYear() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(275.8, deltaT.decimalYear(forDate), 0.01);
    }
}

public class DeltaT {

    public double estimate(LocalDate date) {
        // Implement your calculation here
        return -13.42;
    }

    public double decimalYear(LocalDate date) {
        // Implement your calculation here
        return -150.5;
    }

}