package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[estimateIsZeroOnJanuaryFirst]

Test {

    @Test
    public void [estimateIsZeroOnJanuaryFirst]Test() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        assertEquals(0, DeltaT.estimate(date));
    }

}