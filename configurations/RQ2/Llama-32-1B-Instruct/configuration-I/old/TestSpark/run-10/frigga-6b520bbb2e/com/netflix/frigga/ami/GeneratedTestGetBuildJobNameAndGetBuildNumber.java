package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameAndGetBuildNumber {

    private static final Pattern getAppVersionPattern = new Pattern();
    private static final String getPackageName = "example-ami";
    private static final String getVersion = "1.0";
    private static final String getBuildJobName = "my-jenkins-job";
    private static final String getBuildNumber = "1234567890";
    private static final String getCommit = "abcde1234";

    @Test
    public void testGetBuildJobNameAndGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName(getBuildJobName);
        appVersion.setBuildNumber(getBuildNumber);
        assertEquals(getBuildJobName, appVersion.getBuildJobName());
        assertEquals(getBuildNumber, appVersion.getVersion()); // should match the build number
    }

}