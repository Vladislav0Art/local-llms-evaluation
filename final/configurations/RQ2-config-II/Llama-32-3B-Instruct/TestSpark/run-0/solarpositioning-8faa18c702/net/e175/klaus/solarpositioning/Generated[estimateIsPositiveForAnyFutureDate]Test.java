package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[estimateIsPositiveForAnyFutureDate]

Test {

    @Test
    public void [estimateIsPositiveForAnyFutureDate]Test() {
        LocalDate date = LocalDate.now().plusDays(1);
        assertEquals(1, DeltaT.estimate(date));
    }

}