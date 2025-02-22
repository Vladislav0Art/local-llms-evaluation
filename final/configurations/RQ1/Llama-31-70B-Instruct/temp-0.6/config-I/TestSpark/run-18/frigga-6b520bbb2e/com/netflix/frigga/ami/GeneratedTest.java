package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testParseName_validAppversion() {
        String validAppversion = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppversion);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
    }

    @Test
    public void testParseName_invalidAppversion() {
        String invalidAppversion = "invalid-appversion";
        AppVersion appVersion = AppVersion.parseName(invalidAppversion);
        assertEquals(null, appVersion);
    }

    @Test
    public void testCompareTo_greaterThan() {
        String appversion1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String appversion2 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/151";
        AppVersion appVersion1 = AppVersion.parseName(appversion1);
        AppVersion appVersion2 = AppVersion.parseName(appversion2);
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}