package com.netflix.frigga.ami;

public class GeneratedTest {

    private static final String VALID_APP_VERSION_STRING = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
    private static final String INVALID_APP_VERSION_STRING = "invalid-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

    @Test
    public void testParseName_withValidAppVersionString_returnsAppVersion() {
        AppVersion appVersion = AppVersion.parseName(VALID_APP_VERSION_STRING);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertEquals("150", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
    }

    @Test
    public void testParseName_withInvalidAppVersionString_returnsNull() {
        AppVersion appVersion = AppVersion.parseName(INVALID_APP_VERSION_STRING);
        assertNull(appVersion);
    }

}