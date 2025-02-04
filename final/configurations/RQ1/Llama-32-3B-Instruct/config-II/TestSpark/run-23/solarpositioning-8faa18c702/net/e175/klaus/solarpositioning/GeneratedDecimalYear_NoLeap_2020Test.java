package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedDecimalYear_NoLeap_2020Test {

    @Test
    public void decimalYear_NoLeap_2020Test() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        assertEquals(58.25, DeltaT.decimalYear(forDate), 0.01);
    }
}

public class DeltaTTemp {
    private static final double DELTA_T = 24.106;
    private static final LocalDate FOR_DATE = LocalDate.of(1970, 1, 1);

    public static double getDeltaT() {
        return DELTA_T;
    }

    public static LocalDate getForDate() {
        return FOR_DATE;
    }
}

public class DeltaTReal {

    public static double estimate(LocalDate forDate) {
        // implementation
    }

    public static double decimalYear(LocalDate forDate) {
        // implementation
    }

}