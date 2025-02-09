package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTodayTest {

    @Test
    public void estimateTodayTest() {
        double deltaT = DeltaT.estimate(LocalDate.now());
        assertTrue(Double.isFinite(deltaT));
    }

}