package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(3000, 2, 1));
    }

}