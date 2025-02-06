package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[estimateIsCustomForLocalDate]

Test {

    @Test
    public void [estimateIsCustomForLocalDate]Test() {
        LocalDate date = LocalDate.now();
        assertEquals(0, DeltaT.estimate(date));
    }

}