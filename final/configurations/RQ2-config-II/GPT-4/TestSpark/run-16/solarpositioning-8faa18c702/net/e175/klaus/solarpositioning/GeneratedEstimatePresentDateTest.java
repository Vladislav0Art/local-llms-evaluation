package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        LocalDate presentDate = LocalDate.now();
        double deltaT = DeltaT.estimate(presentDate);

        // Assert something here based on the expectations
        assertNotNull(deltaT);
    }

}