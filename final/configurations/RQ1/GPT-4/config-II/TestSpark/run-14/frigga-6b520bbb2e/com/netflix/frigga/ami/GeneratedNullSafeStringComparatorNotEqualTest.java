package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorNotEqualTest {

    @Test
    public void nullSafeStringComparatorNotEqualTest() {
        AppVersion ver = new AppVersion();

        int result = ver.nullSafeStringComparator("not", "equal");
        assertTrue(result != 0);
    }

}