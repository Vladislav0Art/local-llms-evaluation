package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.now().plusYears(1); // Date 1 year in the future
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}