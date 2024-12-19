package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameNullAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetBuildJobNameNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getBuildJobName());
    }

}