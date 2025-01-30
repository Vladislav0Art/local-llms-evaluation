package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1961And1986Test {

    @Test
    public void estimateYearBetween1961And1986Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1970, 1, 1));
        assertNotNull(deltaT);
    }

}