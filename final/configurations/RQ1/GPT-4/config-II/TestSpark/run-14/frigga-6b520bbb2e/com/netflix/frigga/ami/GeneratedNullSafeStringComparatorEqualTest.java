package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorEqualTest {

    @Test
    public void nullSafeStringComparatorEqualTest() {
        AppVersion ver = new AppVersion();

        int result = ver.nullSafeStringComparator("equal", "equal");
        assertEquals(0, result);
    }

}