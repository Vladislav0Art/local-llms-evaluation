package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameNullAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetPackageNameNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getPackageName());
    }

}