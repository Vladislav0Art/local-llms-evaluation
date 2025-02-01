package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYearBasicTest {

    private static final double EPSILON = 0.00001;

    @Test
    public void decimalYearBasicTest() {
        double decimalYear = DeltaT.estimate(LocalDate.of(2000, 12, 31));

        assertEquals(64.28458909299996, decimalYear, EPSILON);
    }

}