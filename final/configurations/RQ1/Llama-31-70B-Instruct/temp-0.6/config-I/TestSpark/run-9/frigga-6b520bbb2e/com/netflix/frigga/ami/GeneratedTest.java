package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testGetAppVersionPattern() {
        Pattern appVersionPattern = AppVersion.getAppVersionPattern();
        assertNotNull(appVersionPattern);
        assertEquals("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?", appVersionPattern.pattern());
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("subscriberha");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("WE-WAPP-subscriberha");
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("150");
        assertEquals("150", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("h150");
        assertEquals("h150", appVersion.getCommit());
    }

}