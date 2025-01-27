package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateEmptyDateTest() {
        assertEquals(-9999999, (double) DeltaT.estimate(null));
    }

    @Test
    public void estimateInvalidDateTest() throws Exception {
        Object mock = PowerMockito.mock(DeltaT.class);
        when(DeltaT.class).method().withArguments(null, null).thenThrow(NullPointerException.class);
    }

    @Test
    public void estimateSameDateTest() {
        LocalDate forDate = org.junit.platform.datetime.Jdk8DateTime.now();
        DeltaT.estimate(forDate); // no result expected
    }

    @Test
    public void estimateNegativeDaysTest() throws Exception {
        PowerMockito.mockStatic(DeltaT.class);
        when(DeltaT.class).method().withArguments(org.junit.platform.datetime.Jdk8DateTime.of(1, 1, 1), -10.0);
    }

    @Test
    public void estimatePositiveDaysTest() {
        LocalDate forDate = org.junit.platform.datetime.Jdk8DateTime.of(1, 1, 1);
        double deltaT = (double) DeltaT.estimate(forDate);
        assertEquals(-1221399, deltaT);
    }

}