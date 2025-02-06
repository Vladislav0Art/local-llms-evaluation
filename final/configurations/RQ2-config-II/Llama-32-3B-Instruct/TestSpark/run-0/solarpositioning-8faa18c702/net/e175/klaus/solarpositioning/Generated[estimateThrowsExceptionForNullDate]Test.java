package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[estimateThrowsExceptionForNullDate]

Test {

    @Test
    public void [estimateThrowsExceptionForNullDate]Test() throws Exception {
        when(DeltaT.getClass()).thenReturn(this);
        assertThrows(RuntimeException.class, () -> DeltaT.estimate(null));
    }

}