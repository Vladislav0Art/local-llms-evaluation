package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-buildjobname", appVersion.getBuildJobName());
    }

}