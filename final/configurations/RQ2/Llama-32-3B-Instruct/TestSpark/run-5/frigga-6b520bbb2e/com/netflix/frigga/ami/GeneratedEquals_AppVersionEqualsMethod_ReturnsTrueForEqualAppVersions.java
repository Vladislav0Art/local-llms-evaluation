package com.netflix.frigga.ami;

public class GeneratedEquals_AppVersionEqualsMethod_ReturnsTrueForEqualAppVersions {

    @Test
    public void equals_AppVersionEqualsMethod_ReturnsTrueForEqualAppVersions() {
        String version = "1.0";
        String commit = "12345";
        String buildJobName = "my-build-job-name";
        String packageName = "my-package-name";
        AppVersion appVersion1 = new AppVersion(version, commit, buildJobName, packageName);
        AppVersion appVersion2 = new AppVersion(version, commit, buildJobName, packageName);
        assertTrue(appVersion1.equals(appVersion2));
    }

}