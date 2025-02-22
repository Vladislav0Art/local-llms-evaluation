package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("586499.h150", parsedName.getBuildNumber());
    }

    @Test
    public void testNullName() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertEquals(null, parsedName);
    }

    @Test
    public void testCompareTo() {
        AppVersion left = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        AppVersion right = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(0, left.compareTo(right));
    }

    @Test
    public void testNullSafeStringComparator() {
        assertEquals(0, AppVersion.nullSafeStringComparator(null, null));
        assertEquals(-1, AppVersion.nullSafeStringComparator(null, "1"));
        assertEquals(1, AppVersion.nullSafeStringComparator("2", null));
    }

}