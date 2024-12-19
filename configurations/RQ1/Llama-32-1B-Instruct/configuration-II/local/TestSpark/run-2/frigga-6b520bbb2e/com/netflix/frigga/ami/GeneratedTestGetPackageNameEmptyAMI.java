package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameEmptyAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetPackageNameEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.getPackageName());
    }

}