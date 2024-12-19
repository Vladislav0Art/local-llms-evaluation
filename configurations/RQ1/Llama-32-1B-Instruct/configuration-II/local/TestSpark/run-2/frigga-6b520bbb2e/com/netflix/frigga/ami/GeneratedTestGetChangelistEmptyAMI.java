package com.netflix.frigga.ami;

public class GeneratedTestGetChangelistEmptyAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetChangelistEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-changelist", appVersion.getChangelist());
    }

}