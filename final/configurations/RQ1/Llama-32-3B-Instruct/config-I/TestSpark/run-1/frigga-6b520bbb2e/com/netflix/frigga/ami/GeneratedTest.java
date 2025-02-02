package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void givenNullAmiName_whenParseName_thenReturnsNull() {
        Assert.assertNull(AppVersion.parseName(null));
    }

    @Test
    public void givenEmptyStringWhenParseNameThenReturnsNull() {
        Assert.assertNull(AppVersion.parseName(""));
    }

    @Test
    public void whenParseNameThenCorrectlyParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getPackageName(), "subscriberha");
        Assert.assertEquals(appVersion.getVersion(), "1.0.0-586499");
    }

    @Test
    public void whenParseNameThenMissingBuildNumber() {
        String amiName = "subscriberha-1.0.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void whenParseNameThenMissingCommit() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getCommit());
    }

    @Test
    public void whenParseNameThenMissingBuildJobName() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsPackageName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getPackageName(), "subscriberha");
    }

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getVersion(), "1.0.0-586499");
    }

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildJobName() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getBuildJobName(), "h150");
    }

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildNumber() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getBuildNumber(), "h150");
    }

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsCommit() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getCommit(), "h150");
    }

    @Test
    public void whenParsedAppVersionHasInvalidData_thenThrowsNullPointerException() {
        String amiName = "subscriberha-1.0.0.x";
        Assert.assertThrows(NullPointerException.class, () -> AppVersion.parseName(amiName));
    }

}