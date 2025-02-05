package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1910, 1, 1);
        double deltaT = DeltaT.estimate(pastDate);

        // Assert something here based on the expectations
        assertNotNull(deltaT);
    }

}