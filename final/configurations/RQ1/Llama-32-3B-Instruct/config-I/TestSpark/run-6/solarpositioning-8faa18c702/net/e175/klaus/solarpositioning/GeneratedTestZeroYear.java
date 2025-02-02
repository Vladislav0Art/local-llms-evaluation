package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTestZeroYear {

    @Test
    public void testZeroYear() {
        LocalDate forDate = LocalDate.of(0, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20, result, 0.01);
    }

}