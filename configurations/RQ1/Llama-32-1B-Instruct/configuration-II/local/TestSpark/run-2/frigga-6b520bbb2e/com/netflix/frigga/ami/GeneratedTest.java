package com.netflix.frigga.ami;

public class GeneratedTest {

    /**
     * Test parseName method.
     */

    @Test
    public void testParseName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.packageName);
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-1.0.0", appVersion.version);
    }

    @Test
    public void testParseNameNullAMI() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

    @Test
    public void testParseNameInvalidFormat() {
        AppVersion appVersion = AppVersion.parseName("invalid-ami-name");
        assertNull(appVersion);
    }

    @Test
    public void testParseNameEmptyAMI() {
        AppVersion appVersion = AppVersion.parseName("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.packageName);
        assertEquals("1.0.0", appVersion.version);
    }

    @Test
    public void testParseNameValidAMI() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.packageName);
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-1.0.0", appVersion.version);
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.getPackageName());
    }

    @Test
    public void testGetPackageNameNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void testGetPackageNameInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void testGetPackageNameEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.getPackageName());
    }

    @Test
    public void testGetPackageNameValidAMI() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS, appVersion.getPackageName());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-buildjobname", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobNameNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobNameInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobNameEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-buildjobname", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobNameValidAMI() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-buildjobname", appVersion.getBuildJobName());
    }

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void testGetChangelistNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void testGetChangelistInvalidFormat() {
        AppVersion appVersion = new AppVersion("invalid-ami-name");
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void testGetChangelistEmptyAMI() {
        AppVersion appVersion = new AppVersion("");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-changelist", appVersion.getChangelist());
    }

    @Test
    public void testGetChangelistValidAMI() {
        AppVersion appVersion = new AppVersion("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(AppConstants.NAME_HYPHEN_CHARS + "-changelist", appVersion.getChangelist());
    }

    @Test
    public void testGetBuildJobNameNullAMI() {
        AppVersion appVersion = new AppVersion(null);
        assertNull(appVersion.getBuildJobName());
    }

}