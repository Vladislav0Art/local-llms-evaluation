package com.netflix.frigga.ami;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorNonNullValuesTest {

    @Test
    public void nullSafeStringComparatorNonNullValuesTest() throws Exception {
        Method method = AppVersion.class.getDeclaredMethod("nullSafeStringComparator", String.class, String.class);
        method.setAccessible(true);

        String value1 = "value1";
        String value2 = "value2";
        int comparison = (int) method.invoke(new AppVersion(), value1, value2);

        assertEquals(value1.compareTo(value2), comparison);
    }

}