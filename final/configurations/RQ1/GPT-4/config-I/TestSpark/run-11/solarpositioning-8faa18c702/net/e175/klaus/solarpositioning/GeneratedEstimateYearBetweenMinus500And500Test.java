package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(0, 1, 1));
        assertNotNull(deltaT);
    }

}