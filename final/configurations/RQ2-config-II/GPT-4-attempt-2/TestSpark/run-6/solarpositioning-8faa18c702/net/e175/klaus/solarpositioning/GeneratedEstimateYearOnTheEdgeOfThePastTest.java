package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearOnTheEdgeOfThePastTest {

    @Test
    public void estimateYearOnTheEdgeOfThePastTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(1700, 2, 1));
        assertTrue(Double.isFinite(deltaT));
    }

}