package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNullSafeStringComparator {

    @Test
    public void testNullSafeStringComparator() {
        AppVersion appVersion = new AppVersion();
        assertEquals(0, appVersion.nullSafeStringComparator(null, null));
        assertEquals(-1, appVersion.nullSafeStringComparator(null, "test"));
        assertEquals(1, appVersion.nullSafeStringComparator("test", null));
        assertEquals(0, appVersion.nullSafeStringComparator("test", "test"));
        assertEquals(-1, appVersion.nullSafeStringComparator("test", "testa"));
        assertEquals(1, appVersion.nullSafeStringComparator("testa", "test"));
    }

}