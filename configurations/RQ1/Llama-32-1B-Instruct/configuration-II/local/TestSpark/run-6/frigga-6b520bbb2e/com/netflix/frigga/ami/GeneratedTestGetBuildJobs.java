package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobs {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetBuildJobs() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getBuildJobName());

        appVersion = parseName("subscriberha-1.0.0-586499.h150");
        assertEquals("h150", appVersion.getBuildJobName());
    }

}