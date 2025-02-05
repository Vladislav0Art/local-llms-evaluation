package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateAfter2005Test {

    @Test
    public void estimateDateAfter2005Test() {
        LocalDate dateAfter2005 = LocalDate.of(2006, 1, 1);

        double expectedValue = 64.257;

        double actualValue = DeltaT.estimate(dateAfter2005);

        assertEquals(expectedValue, actualValue, 0.001);
    }

}