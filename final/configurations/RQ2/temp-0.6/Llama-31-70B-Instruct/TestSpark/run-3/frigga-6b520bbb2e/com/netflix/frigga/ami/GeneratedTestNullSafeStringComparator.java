package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GeneratedTestNullSafeStringComparator {

    @Test
    public void testNullSafeStringComparator() {
        AppVersion appVersion = new AppVersion();
        assertEquals(0, appVersion.nullSafeStringComparator(null, null));
        assertEquals(-1, appVersion.nullSafeStringComparator(null, "test"));
        assertEquals(1, appVersion.nullSafeStringComparator("test", null));
        assertEquals(0, appVersion.nullSafeStringComparator("test", "test"));
        assertNotEquals(0, appVersion.nullSafeStringComparator("test", "test2"));
    }

}