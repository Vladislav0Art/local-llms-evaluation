package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTRemotePastFutureTest {

    @Test
    public void estimateDeltaTRemotePastFutureTest() {
        LocalDate forDate = LocalDate.of(-1000000, 1, 1);
        DeltaT.estimate(forDate);
    }

}