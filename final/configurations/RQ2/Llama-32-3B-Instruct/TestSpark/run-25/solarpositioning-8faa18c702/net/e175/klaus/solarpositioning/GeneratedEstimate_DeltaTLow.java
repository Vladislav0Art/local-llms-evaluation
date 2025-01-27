package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.runners.JUnit4.classWithResources;

import org.junit.runner.RunWith;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

@RunWith(classWithResources::class)
public class GeneratedEstimate_DeltaTLow {

    @Test
    public void estimate_DeltaTLow() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result;
        try {
            result = (double) ((Method) DeltaT.class.getMethod("estimate", LocalDate.class)).invoke(null, forDate);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        }
        assertThat(result, is((double) 0));
    }

}