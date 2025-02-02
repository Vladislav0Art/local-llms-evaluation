package com.netflix.frigga.ami;

public class GeneratedTestAppVersionGetters {

    private String buildJobName;
    private int buildNumber;
    private String commit;
    private String buildDate;

    public AppVersion() {
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }
}

public class AppVersionTest {

    @Test
    public void testAppVersionGetters() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("jenkins-job-name");
        appVersion.setBuildNumber(123);
        appVersion.setCommit("commit-id");

        assertEquals("", appVersion.getBuildJobName());
        assertEquals(0, appVersion.getBuildNumber());
        assertEquals("", appVersion.getCommit());
    }

}