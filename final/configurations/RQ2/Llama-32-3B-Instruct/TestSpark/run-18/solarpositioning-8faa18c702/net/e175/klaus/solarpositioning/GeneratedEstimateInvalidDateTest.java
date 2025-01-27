package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateInvalidDateTest {

    @Test
    public void estimateInvalidDateTest() throws Exception {
        Object mock = PowerMockito.mock(DeltaT.class);
        when(DeltaT.class).method().withArguments(null, null).thenThrow(NullPointerException.class);
    }

}