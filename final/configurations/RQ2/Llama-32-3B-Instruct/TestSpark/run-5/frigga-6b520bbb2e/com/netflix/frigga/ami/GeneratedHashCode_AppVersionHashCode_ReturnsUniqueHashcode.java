package com.netflix.frigga.ami;

public class GeneratedHashCode_AppVersionHashCode_ReturnsUniqueHashcode {

    @Test
    public void hashCode_AppVersionHashCode_ReturnsUniqueHashcode() {
        String version = "1.0";
        String commit = "12345";
        String buildJobName = "my-build-job-name";
        String packageName = "my-package-name";
        AppVersion appVersion1 = new AppVersion(version, commit, buildJobName, packageName);
        AppVersion appVersion2 = new AppVersion(version, commit, buildJobName, packageName);
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}