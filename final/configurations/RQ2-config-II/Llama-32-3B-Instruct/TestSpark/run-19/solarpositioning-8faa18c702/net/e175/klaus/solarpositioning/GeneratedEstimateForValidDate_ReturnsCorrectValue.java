package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedEstimateForValidDate_ReturnsCorrectValue {

    @Test
    public void estimateForValidDate_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2022, 6, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = 10.536;
        assertEquals(expected, actual, 0.01);
    }

}