package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedTestNullSafeStringComparator {

    @Test
    public void testNullSafeStringComparator() {
        assertEquals(0, AppVersion.nullSafeStringComparator(null, null));
        assertEquals(-1, AppVersion.nullSafeStringComparator(null, "1"));
        assertEquals(1, AppVersion.nullSafeStringComparator("2", null));
    }

}