package com.netflix.frigga.ami;

public class GeneratedTestGetChangelistInvalidFormat {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetChangelistInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getChangelist());
    }

}