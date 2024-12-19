package com.netflix.frigga.ami;

public class GeneratedTest {

    /**
     * Tests for `getPackageName()` method.
     */

    @Test
    public void testGetPackageNames() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getPackageNames());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

    @Test
    public void testGetVersions() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getVersion());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha-1.0.0", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobs() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getBuildJobName());

        appVersion = parseName("subscriberha-1.0.0-586499.h150");
        assertEquals("h150", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumbers() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getBuildNumber());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommits() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getCommit());

        appVersion = parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getCommit());
    }

}