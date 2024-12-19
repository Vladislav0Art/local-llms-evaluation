package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion(buildJobName, packageVersion);
        assertEquals(AppVersion.hashCode(), version1.hashCode());
    }

}