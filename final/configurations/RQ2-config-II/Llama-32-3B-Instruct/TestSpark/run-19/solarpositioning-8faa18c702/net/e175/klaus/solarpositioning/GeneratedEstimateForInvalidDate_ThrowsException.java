package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedEstimateForInvalidDate_ThrowsException {

    @Test
    public void estimateForInvalidDate_ThrowsException() {
        LocalDate forDate = LocalDate.of(2022, 13, 1);
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(forDate));
    }

}