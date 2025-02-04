package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_GivenValidAmiString_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedAppVersion.packageName);
        assertEquals("1.0.0-586499", parsedAppVersion.version);
    }

    @Test
    public void parseName_GivenInvalidAmiString_ReturnsNull() {
        String amiName = "invalid";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void parseName_GivenAminull_ReturnsNull() {
        String amiName = null;
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void getAppVersionPattern_GivesValidAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("subscriberha-1.0.0-586499").find());
    }

    @Test
    public void getPackageName_ReturnsCorrectPackage() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getCommit());
    }

    @Test
    public void getChangelist_ReturnsCorrectChangelist() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getChangelist());
    }

}