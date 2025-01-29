package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEstimate_GoesOutsideTheBounds {

    private final LocalDate forDate = LocalDate.of(2022, 1, 1);

    @Test
    public void testEstimate_GoesOutsideTheBounds() {
        Mockito.when(DeltaT.estimate(forDate)).thenReturn(-10_000_000);
        System.out.println("DeltaT.estimate(" + forDate + ") -> " + DeltaT.estimate(forDate));
    }

}