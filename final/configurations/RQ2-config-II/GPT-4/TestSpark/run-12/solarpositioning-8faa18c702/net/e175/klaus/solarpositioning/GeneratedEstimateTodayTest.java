package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTodayTest {

    @Test
    public void estimateTodayTest() {
        LocalDate today = LocalDate.now();

        double expectedValue = 70.661;

        double actualValue = DeltaT.estimate(today);

        assertEquals(expectedValue, actualValue, 0.001);
    }

}