package com.netflix.frigga.ami;

public class GeneratedTestGetChangelistNullAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetChangelistNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getChangelist());
    }

}