package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1960, 1, 1);
        double result = DeltaT.estimate(pastDate);
        // assert according to your known result here.
    }

}