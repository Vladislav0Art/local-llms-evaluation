package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GeneratedGetDeltaTValues_ReturnsCorrectList {

    @Test
    public void getDeltaTValues_ReturnsCorrectList() {
        List<Double> actual = DeltaT.getDeltaTValues(LocalDate.of(2022, 6, 1));
        List<Double> expected = List.of(10.536, 13.452);
        assertEquals(expected, actual);
    }

}