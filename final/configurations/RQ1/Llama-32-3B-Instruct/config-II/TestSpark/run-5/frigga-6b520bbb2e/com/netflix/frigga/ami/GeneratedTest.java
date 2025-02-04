package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_MatchFound_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

    @Test
    public void parseName_NonMatchedInput_ReturnsNull() {
        String amiName = "non-matched-input";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void parseName_NullInput_ReturnsNull() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        Pattern expectedPattern = Pattern.compile("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test-package-name");
        String packageName = appVersion.getPackageName();
        assertEquals("test-package-name", packageName);
    }

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version);
    }

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("test-build-job-name");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("test-build-job-name", buildJobName);
    }

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("12345");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("12345", buildNumber);
    }

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("abcdefg");
        String commit = appVersion.getCommit();
        assertEquals("abcdefg", commit);
    }

}