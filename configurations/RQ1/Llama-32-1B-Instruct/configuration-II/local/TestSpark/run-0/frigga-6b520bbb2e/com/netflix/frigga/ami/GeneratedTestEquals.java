package com.netflix.frigga.ami;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion(buildJobName, packageVersion);
        assertTrue(AppVersion.equals(version1, version2));
    }

}