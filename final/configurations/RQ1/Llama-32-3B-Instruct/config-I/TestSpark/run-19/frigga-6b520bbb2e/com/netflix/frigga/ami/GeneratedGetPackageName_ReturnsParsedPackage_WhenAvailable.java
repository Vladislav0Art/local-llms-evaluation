package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsParsedPackage_WhenAvailable {

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
    public void getPackageName_ReturnsParsedPackage_WhenAvailable() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedAppVersion.getPackageName());
    }

}