package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaT_FixYear_1970Test() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        assertEquals(24.106, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimateDeltaT_NoLeap_2020Test() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        assertEquals(16.3456, DeltaT.estimate(forDate), 0.0001);
    }

    @Test
    public void estimateDeltaT_WithLeap_2012Test() {
        LocalDate forDate = LocalDate.of(2012, 1, 1);
        assertEquals(15.4457, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void decimalYear_FixYear_1970Test() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        assertEquals(47.5, DeltaT.decimalYear(forDate), 0.01);
    }

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