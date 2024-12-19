package com.netflix.frigga.ami;

public class GeneratedTestParseNameNullAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testParseNameNullAMI() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}