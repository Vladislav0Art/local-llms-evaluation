package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    /**
     * Test parseName method.
     */

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertNull(appVersion.getChangelist());
    }

}