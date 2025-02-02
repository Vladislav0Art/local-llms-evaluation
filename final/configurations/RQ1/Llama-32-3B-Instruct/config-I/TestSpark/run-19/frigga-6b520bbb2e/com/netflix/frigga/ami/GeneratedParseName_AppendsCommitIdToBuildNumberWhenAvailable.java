package com.netflix.frigga.ami;

public class GeneratedParseName_AppendsCommitIdToBuildNumberWhenAvailable {

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
    public void parseName_AppendsCommitIdToBuildNumberWhenAvailable() {
        String amiName = "subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("h586499", parsedAppVersion.buildNumber);
    }

}