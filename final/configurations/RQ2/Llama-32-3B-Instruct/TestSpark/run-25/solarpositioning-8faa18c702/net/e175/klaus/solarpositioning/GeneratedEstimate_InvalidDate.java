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
public class GeneratedEstimate_InvalidDate {

    @Test
    public void estimate_InvalidDate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LocalDate forDate = null;
        try {
            ((Method) DeltaT.class.getMethod("estimate", LocalDate.class)).invoke(null, forDate);
        } catch (InvocationTargetException | NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}

public class DeltaT {

    public static double estimate(LocalDate date) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // implementation of the method
        return 0;
    }

}