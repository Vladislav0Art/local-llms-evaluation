package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameInvalidFormat {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetBuildJobNameInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getBuildJobName());
    }

}