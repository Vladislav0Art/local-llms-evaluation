package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedGetDeltaTValues_NullDate_ReturnsEmptyList {

    @Test
    public void getDeltaTValues_NullDate_ReturnsEmptyList() {
        List<Double> actual = DeltaT.getDeltaTValues(null);
        assertTrue(actual.isEmpty());
    }

}