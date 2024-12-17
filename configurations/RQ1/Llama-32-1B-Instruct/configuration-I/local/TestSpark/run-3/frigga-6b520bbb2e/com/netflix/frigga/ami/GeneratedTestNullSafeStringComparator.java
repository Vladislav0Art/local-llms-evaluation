package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNullSafeStringComparator {

    private AppVersion appVersion = new AppVersion();

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testNullSafeStringComparator() {
        String one = "hello";
        String two = "world";

        when(appVersion.nullSafeStringComparator(one)).thenReturn(1);
        when(appVersion.nullSafeStringComparator(two)).thenReturn(-1);

        assertEquals(1, appVersion.nullSafeStringComparator(one));
        assertEquals(-1, appVersion.nullSafeStringComparator(two));

        assertNotEquals(one, appVersion.nullSafeStringComparator(two));
    }

}