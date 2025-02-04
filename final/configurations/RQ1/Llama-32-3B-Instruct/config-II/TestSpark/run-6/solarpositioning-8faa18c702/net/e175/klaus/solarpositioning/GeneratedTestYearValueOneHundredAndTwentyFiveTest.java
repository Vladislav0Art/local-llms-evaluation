package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedTestYearValueOneHundredAndTwentyFiveTest {

    @Test
    public void testYearValueOneHundredAndTwentyFiveTest() {
        assertEquals(7.62 + 0.5737 * 125 - 0.251754 * pow(125, 2) + 0.01680668 * pow(125, 3) - 0.0004473624 * pow(125, 4)
                + pow(125, 5) / 5, DeltaT.estimate(LocalDate.of(1921, 12, 31)));
    }

}