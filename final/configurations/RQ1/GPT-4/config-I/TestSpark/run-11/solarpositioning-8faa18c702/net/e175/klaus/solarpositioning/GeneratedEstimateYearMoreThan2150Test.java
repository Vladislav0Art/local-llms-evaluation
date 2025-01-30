package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearMoreThan2150Test {

    @Test
    public void estimateYearMoreThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2200, 1, 1));
        assertNotNull(deltaT);
    }

}