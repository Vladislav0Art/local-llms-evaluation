package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNegativeDaysTest {

    @Test
    public void estimateNegativeDaysTest() throws Exception {
        PowerMockito.mockStatic(DeltaT.class);
        when(DeltaT.class).method().withArguments(org.junit.platform.datetime.Jdk8DateTime.of(1, 1, 1), -10.0);
    }

}