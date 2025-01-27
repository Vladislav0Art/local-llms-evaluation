package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void estimate_DeltaTLow() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertThat(result, is((double) 0));
    }

    @Test
    public void estimate_DeltaTHigh() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertThat(result, is((double) 11.92));
    }

    @Test
    public void estimate_PastDate() {
        LocalDate forDate = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertThat(result, is((double) 0));
    }

    @Test
    public void estimate_FutureDate() {
        LocalDate forDate = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertThat(result, is((double) -11.92));
    }

}