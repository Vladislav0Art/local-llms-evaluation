package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testNullSafeStringComparator() {
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion.nullSafeStringComparator("one", "two"), -1);
        assertEquals(appVersion.nullSafeStringComparator("one", "one"), 0);
        assertEquals(appVersion.nullSafeStringComparator("two", "one"), 1);
        assertEquals(appVersion.nullSafeStringComparator(null, "one"), -1);
        assertEquals(appVersion.nullSafeStringComparator(null, null), 0);
        assertEquals(appVersion.nullSafeStringComparator("one", null), 1);
    }

}