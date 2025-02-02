package com.netflix.frigga.ami;

public class GeneratedTest {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;
    private String changelist;

    public static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getChangelist() {
        return changelist;
    }

    public void setChangelist(String changelist) {
        this.changelist = changelist;
    }
}

public class AppVersionTest {

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test");
        appVersion.setVersion("1.0.0-586499");
        String packageName = appVersion.getPackageName();
        String version = appVersion.getVersion();
        assertEquals("test", packageName);
        assertEquals("1.0.0-586499", version);
    }

    @Test
    public void testGetAndSetPackageAndVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test");
        appVersion.setVersion("1.0.0-586499");
        String packageName = appVersion.getPackageName();
        String version = appVersion.getVersion();
        assertEquals("test", packageName);
        assertEquals("1.0.0-586499", version);
    }

}