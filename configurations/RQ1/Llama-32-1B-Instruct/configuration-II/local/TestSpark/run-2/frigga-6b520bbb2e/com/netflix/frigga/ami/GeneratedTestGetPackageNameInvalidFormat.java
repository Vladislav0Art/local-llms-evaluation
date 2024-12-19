package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameInvalidFormat {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetPackageNameInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getPackageName());
    }

}