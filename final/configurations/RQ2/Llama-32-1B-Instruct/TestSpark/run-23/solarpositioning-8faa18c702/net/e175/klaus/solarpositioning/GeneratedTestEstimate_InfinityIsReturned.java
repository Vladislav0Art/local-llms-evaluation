package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEstimate_InfinityIsReturned {

    private final LocalDate forDate = LocalDate.of(2022, 1, 1);

    @Test
    public void testEstimate_InfinityIsReturned() {
        Mockito.when(DeltaT.estimate(forDate)).thenAnswer(r -> Double.POSITIVE_INFINITY);
        System.out.println("DeltaT.estimate(" + forDate + ") -> " + DeltaT.estimate(forDate));
    }

}