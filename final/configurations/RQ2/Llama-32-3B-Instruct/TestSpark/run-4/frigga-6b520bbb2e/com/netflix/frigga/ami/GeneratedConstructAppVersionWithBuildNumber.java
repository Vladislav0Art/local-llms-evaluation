package com.netflix.frigga.ami;

public class GeneratedConstructAppVersionWithBuildNumber {

    @Test
    public void constructAppVersionWithBuildNumber() {
        String buildNumber = "1.2.3";
        AppVersion appVersion = new AppVersion("", buildNumber, "");
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }
}

public class AppVersion {

    private String id;
    private String packageName;
    private String commit;
    private String buildNumber;

    public static AppVersion parse(String amiId) {
        // implementation of the parse method
        return new AppVersion(amiId, null, null);
    }

    public static AppVersion parse(String amiId, String packageName) {
        // implementation of the parse method
        return new AppVersion(amiId, packageName, null);
    }

    public static AppVersion parse(String amiId, String packageName, String commit) {
        // implementation of the parse method
        return new AppVersion(amiId, packageName, commit);
    }

    private AppVersion(String id, String buildNumber, String commit) {
        this.id = id;
        this.buildNumber = buildNumber;
        this.commit = commit;
    }

    public String getId() {
        return id;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getCommit() {
        return commit;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

}