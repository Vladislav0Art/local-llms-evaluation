package com.netflix.frigga.ami;

public class GeneratedTestParseNameEmptyAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testParseNameEmptyAMI() {
        AppVersion appVersion = AppVersion.parseName("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.packageName);
        assertEquals("1.0.0", appVersion.version);
    }

}