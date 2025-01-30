package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDecimalYearTest {

    @Test
    public void decimalYearTest() {
        LocalDate date = LocalDate.of(1990, 10, 1);
        double result = DeltaT.estimate(date);
        assertTrue(result > 57);
    }

}