package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateBefore2005Test {

    @Test
    public void estimateDateBefore2005Test() {
        LocalDate dateBefore2005 = LocalDate.of(2004, 12, 31);

        double expectedValue = 63.293;

        double actualValue = DeltaT.estimate(dateBefore2005);

        assertEquals(expectedValue, actualValue, 0.001);
    }

}