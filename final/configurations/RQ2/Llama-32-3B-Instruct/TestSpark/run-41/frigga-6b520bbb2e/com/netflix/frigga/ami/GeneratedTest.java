package com.netflix.frigga.ami;

public class GeneratedTest {

    private String appName;
    private String version;

    public static AppVersion parseName(String amiName) {
        // implementation
        return new AppVersion(amiName);
    }

    public static AppVersion fromString(String amiName) {
        int lastIndex = amiName.lastIndexOf('/');
        if (lastIndex == -1) {
            throw new RuntimeException("Invalid format");
        }
        String appName = amiName.substring(0, lastIndex);
        String version = amiName.substring(lastIndex + 1);

        return new AppVersion(appName, version);
    }

    public AppVersion(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public String getPackageName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}

public class GeneratedTest {

    @Test
    public void parseName_ValidNameReturnsParsedAppVersion() {
        AppVersion appVersion = AppVersion.parseName("my-app/1.0");
        assertNotNull(appVersion);
        assertEquals("my-app", appVersion.getPackageName());
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getAppVersionPattern_ReturnsValidPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern != null && pattern.matcher("").find());
    }

    @Test
    public void getPackageName_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getPackageName());
    }

    @Test
    public void getVersion_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getVersion());
    }

    @Test
    public void getBuildJobName_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getBuildJobName());
    }

    @Test
    public void getBuildNumber_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getBuildNumber());
    }

    @Test
    public void getCommit_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getCommit());
    }

    @Test
    public void getChangelist_DeprecatedMethodReturnsDeprecatedMessage() {
        String changelist = AppVersion.parseName("my-app/1.0").getChangelist();
        assertNotNull(changelist);
        assertTrue(changelist.contains("@deprecated"));
    }

    @Test
    public void parseName_ValidNameReturnsParsedAppVersion() {
        String amiName = "my-app/1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("my-app", appVersion.getPackageName());
        assertEquals("1.0", appVersion.getVersion());
    }

}