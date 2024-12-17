package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionWithNullPackageAndVersionAndBuildNumberAndChangelistAndCommit {

    private String packageName;
    private long version;
    private String buildJobName;
    private int buildNumber;
    private String changelist;

    public AppVersion(String packageName, long version, String buildJobName, int buildNumber, String changelist) {
        this.packageName = packageName;
        this.version = version;
        this.buildJobName = buildJobName;
        this.buildNumber = buildNumber;
        this.changelist = changelist;
    }

    public String getPackageName() {
        return packageName;
    }

    public long getVersion() {
        return version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public String getChangelist() {
        return changelist;
    }
}

public class AppVersionTest {

    @Test
    public void testGetAppVersionWithNullPackageAndVersionAndBuildNumberAndChangelistAndCommit() {
        AppVersion appVersion = new AppVersion("com.example.app", 1L, "jenkins-job", 1, "");
        System.out.println(appVersion.getPackageName());
        System.out.println(appVersion.getVersion());
        System.out.println(appVersion.getBuildJobName());
        System.out.println(appVersion.getBuildNumber());
        System.out.println(appVersion.getChangelist());
        System.out.println(appVersion.getCommit());
    }

}