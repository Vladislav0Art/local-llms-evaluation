package com.netflix.frigga.ami;

public class GeneratedTestParsedAppVersionBuildJobName {

    private String buildNumber;
    private String buildJobName;
    private String packageName;

    public AppVersion() {
        this.buildNumber = "h586499";
        this.buildJobName = "";
        this.packageName = "subscriberha";
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}

public class TestSpark {

    @Test
    public void testParsedAppVersionBuildJobName() {
        AppVersion parsedAppVersion = new AppVersion();
        assertTrue(parsedAppVersion.getBuildJobName().isEmpty());
    }

}