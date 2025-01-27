package com.netflix.frigga.ami;

public class GeneratedToString_AppVersionToString_ReturnsAppVersionString {

    @Test
    public void toString_AppVersionToString_ReturnsAppVersionString() {
        String version = "1.0";
        String commit = "12345";
        String buildJobName = "my-build-job-name";
        String packageName = "my-package-name";
        AppVersion appVersion = new AppVersion(version, commit, buildJobName, packageName);
        assertNotNull(appVersion.toString());
    }

}