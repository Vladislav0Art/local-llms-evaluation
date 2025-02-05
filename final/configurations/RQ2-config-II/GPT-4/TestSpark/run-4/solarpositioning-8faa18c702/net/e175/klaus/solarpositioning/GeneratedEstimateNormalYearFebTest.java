package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNormalYearFebTest {

    @Test
    public void estimateNormalYearFebTest() {
        LocalDate date = LocalDate.of(2019, 2, 28); // Non-leap year February 28
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}