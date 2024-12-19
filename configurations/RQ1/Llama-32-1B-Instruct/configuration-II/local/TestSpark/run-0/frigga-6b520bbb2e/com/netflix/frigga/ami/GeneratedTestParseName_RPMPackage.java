package com.netflix.frigga.ami;

public class GeneratedTestParseName_RPMPackage {

    @Test
    public void testParseName_RPMPackage() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-" + packageVersion);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(packageVersion, parsedVersion.getVersion());
    }

}