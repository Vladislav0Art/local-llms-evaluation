package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateNullDateThrowsNullPointerException {

    @Test
    public void estimateNullDateThrowsNullPointerException() {
        List<LocalDate> dates = new ArrayList<>();
        assertThrows(NullPointerException.class, () -> DeltaT.estimate((LocalDate[]) null));
    }

}