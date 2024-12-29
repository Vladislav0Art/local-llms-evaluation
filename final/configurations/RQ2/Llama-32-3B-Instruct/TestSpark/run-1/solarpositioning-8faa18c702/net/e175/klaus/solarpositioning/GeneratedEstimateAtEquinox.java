package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateAtEquinox {

    @Test
    public void estimateAtEquinox() {
        LocalDate equinox = LocalDate.of(2022, 3, 20);
        double result = DeltaT.estimate(equinox);
        assertNotNull(result);
    }

}