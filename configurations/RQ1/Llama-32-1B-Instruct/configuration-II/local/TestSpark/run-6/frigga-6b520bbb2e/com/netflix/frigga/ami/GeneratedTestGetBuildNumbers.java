package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumbers {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetBuildNumbers() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getBuildNumber());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getBuildNumber());
    }

}