package com.netflix.frigga.ami;

public class GeneratedTestGetChangelistValidAMI {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetChangelistValidAMI() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-changelist", appVersion.getChangelist());
    }

}