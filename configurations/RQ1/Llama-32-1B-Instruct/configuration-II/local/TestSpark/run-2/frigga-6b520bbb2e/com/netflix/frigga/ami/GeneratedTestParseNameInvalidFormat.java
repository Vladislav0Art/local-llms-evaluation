package com.netflix.frigga.ami;

public class GeneratedTestParseNameInvalidFormat {

    /**
     * Test parseName method.
     */

    @Test
    public void testParseNameInvalidFormat() {
        AppVersion appVersion = AppVersion.parseName("invalid-ami-name");
        assertNull(appVersion);
    }

}