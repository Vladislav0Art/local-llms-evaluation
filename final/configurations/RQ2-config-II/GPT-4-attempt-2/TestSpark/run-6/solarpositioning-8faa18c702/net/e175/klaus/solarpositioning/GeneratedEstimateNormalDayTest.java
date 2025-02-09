package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNormalDayTest {

    @Test
    public void estimateNormalDayTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(2018, 1, 2));
        assertTrue(Double.isFinite(deltaT));
    }

}