package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[estimateIsZeroOnDecemberLast]

Test {

    @Test
    public void [estimateIsZeroOnDecemberLast]Test() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        assertEquals(0, DeltaT.estimate(date));
    }
}

}