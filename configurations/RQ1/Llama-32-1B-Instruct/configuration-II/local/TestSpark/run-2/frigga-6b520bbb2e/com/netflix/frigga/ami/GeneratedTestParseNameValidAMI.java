package com.netflix.frigga.ami;

public class GeneratedTestParseNameValidAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testParseNameValidAMI() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.packageName);
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-1.0.0", appVersion.version);
    }

}