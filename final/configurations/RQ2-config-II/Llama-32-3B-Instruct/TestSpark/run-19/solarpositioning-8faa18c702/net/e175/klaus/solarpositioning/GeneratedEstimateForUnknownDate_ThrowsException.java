package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedEstimateForUnknownDate_ThrowsException {

    @Test
    public void estimateForUnknownDate_ThrowsException() {
        LocalDate forDate = null;
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDate));
    }

}