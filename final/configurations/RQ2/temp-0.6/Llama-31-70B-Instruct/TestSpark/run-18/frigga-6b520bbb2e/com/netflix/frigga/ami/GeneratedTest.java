package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

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

    @Test
    public void testCompareTo() {
        AppVersion appVersion = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion.compareTo(appVersion2));
    }

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        assertEquals(APP_VERSION_PATTERN, appVersion.getAppVersionPattern());
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

}