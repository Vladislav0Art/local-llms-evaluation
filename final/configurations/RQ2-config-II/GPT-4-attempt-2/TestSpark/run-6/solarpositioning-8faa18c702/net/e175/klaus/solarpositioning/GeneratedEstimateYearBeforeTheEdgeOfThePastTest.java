package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBeforeTheEdgeOfThePastTest {

    @Test
    public void estimateYearBeforeTheEdgeOfThePastTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(1699, 12, 31));
    }

}