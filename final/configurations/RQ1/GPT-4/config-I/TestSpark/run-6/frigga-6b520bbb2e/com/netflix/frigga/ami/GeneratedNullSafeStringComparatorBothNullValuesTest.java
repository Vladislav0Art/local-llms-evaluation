package com.netflix.frigga.ami;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorBothNullValuesTest {

    @Test
    public void nullSafeStringComparatorBothNullValuesTest() throws Exception {
        Method method = AppVersion.class.getDeclaredMethod("nullSafeStringComparator", String.class, String.class);
        method.setAccessible(true);

        int comparison = (int) method.invoke(new AppVersion(), null, null);

        assertEquals(0, comparison);
    }

}