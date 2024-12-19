package com.netflix.frigga.ami;

public class GeneratedTestToString {

    private static final Pattern getAppVersionPattern = new Pattern();
    private static final String getPackageName = "example-ami";
    private static final String getVersion = "1.0";
    private static final String getBuildJobName = "my-jenkins-job";
    private static final String getBuildNumber = "1234567890";
    private static final String getCommit = "abcde1234";

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName(getPackageName);
        appVersion.setVersion(getVersion);
        assertEquals("example-ami", appVersion.toString());
    }

}