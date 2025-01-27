package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateSameDateTest {

    @Test
    public void estimateSameDateTest() {
        LocalDate forDate = org.junit.platform.datetime.Jdk8DateTime.now();
        DeltaT.estimate(forDate); // no result expected
    }

}