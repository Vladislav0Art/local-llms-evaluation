package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestNullSafeStringComparator {

    @Test
    public void testNullSafeStringComparator() {
        AppVersion appVersion = new AppVersion();
        String one = "test1";
        String two = "test2";
        int result = appVersion.nullSafeStringComparator(one, two);
        assertEquals(result, one.compareTo(two));
    }

}