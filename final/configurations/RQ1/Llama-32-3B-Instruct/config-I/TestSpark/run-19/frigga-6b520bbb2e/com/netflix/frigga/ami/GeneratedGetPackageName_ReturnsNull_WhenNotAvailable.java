package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsNull_WhenNotAvailable {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public static AppVersion parseName(String amiName) {
        // implementation
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public String getCommit() {
        return commit;
    }
}

public class AppVersionTest {

    @Test
    public void getPackageName_ReturnsNull_WhenNotAvailable() {
        String amiName = "invalid-app-pattern";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion.getPackageName());
    }

}