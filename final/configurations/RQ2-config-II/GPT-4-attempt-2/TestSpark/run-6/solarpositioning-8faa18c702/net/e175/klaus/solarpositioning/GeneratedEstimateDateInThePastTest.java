package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateInThePastTest {

    @Test
    public void estimateDateInThePastTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(1985, 2, 1));
        assertTrue(Double.isFinite(deltaT));
    }

}