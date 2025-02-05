package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateBoundaryUpperValueTest {

    @Test
    public void estimateBoundaryUpperValueTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}