package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        LocalDate date = LocalDate.now(); // Current date
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}