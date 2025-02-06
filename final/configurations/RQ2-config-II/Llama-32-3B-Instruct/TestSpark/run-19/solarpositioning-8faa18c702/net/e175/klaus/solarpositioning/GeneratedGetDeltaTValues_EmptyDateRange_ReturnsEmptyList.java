package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedGetDeltaTValues_EmptyDateRange_ReturnsEmptyList {

    @Test
    public void getDeltaTValues_EmptyDateRange_ReturnsEmptyList() {
        List<Double> actual = DeltaT.getDeltaTValues(LocalDate.of(2022, 6, 1), LocalDate.of(2022, 6, 1));
        assertTrue(actual.isEmpty());
    }

}