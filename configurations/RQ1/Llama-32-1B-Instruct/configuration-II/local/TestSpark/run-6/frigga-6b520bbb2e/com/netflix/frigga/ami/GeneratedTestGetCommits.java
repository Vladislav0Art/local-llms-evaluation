package com.netflix.frigga.ami;

public class GeneratedTestGetCommits {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetCommits() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getCommit());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getCommit());
    }

}