package com.netflix.frigga.ami;

public class GeneratedTestGetVersions {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetVersions() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getVersion());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha-1.0.0", appVersion.getVersion());
    }

}