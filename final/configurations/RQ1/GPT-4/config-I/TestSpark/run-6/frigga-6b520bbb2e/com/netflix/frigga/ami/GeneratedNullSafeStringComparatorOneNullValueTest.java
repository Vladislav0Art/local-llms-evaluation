package com.netflix.frigga.ami;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorOneNullValueTest {

    @Test
    public void nullSafeStringComparatorOneNullValueTest() throws Exception {
        Method method = AppVersion.class.getDeclaredMethod("nullSafeStringComparator", String.class, String.class);
        method.setAccessible(true);

        String value1 = "value1";
        int comparison = (int) method.invoke(new AppVersion(), value1, null);

        assertEquals(1, comparison);

        comparison = (int) method.invoke(new AppVersion(), null, value1);

        assertEquals(-1, comparison);
    }

}