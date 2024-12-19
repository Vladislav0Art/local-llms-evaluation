package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNames {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetPackageNames() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getPackageNames());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}