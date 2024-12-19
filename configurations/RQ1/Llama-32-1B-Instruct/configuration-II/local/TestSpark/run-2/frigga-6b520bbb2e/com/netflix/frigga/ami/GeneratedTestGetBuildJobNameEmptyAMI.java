package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameEmptyAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetBuildJobNameEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-buildjobname", appVersion.getBuildJobName());
    }

}