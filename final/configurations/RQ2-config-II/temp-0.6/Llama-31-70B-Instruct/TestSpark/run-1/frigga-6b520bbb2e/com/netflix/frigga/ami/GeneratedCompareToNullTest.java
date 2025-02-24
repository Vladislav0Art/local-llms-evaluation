package com.netflix.frigga.ami;

public class GeneratedCompareToNullTest {

    private static final String EXPECTED_AMI_NAME = "ami-1234567890";
    private static final String EXPECTED_PACKAGE_NAME = "packageName";
    private static final String EXPECTED_VERSION = "version";
    private static final String EXPECTED_BUILD_JOB_NAME = "buildJobName";
    private static final String EXPECTED_BUILD_NUMBER = "buildNumber";
    private static final String EXPECTED_COMMIT = "commit";
    private static final String EXPECTED_CHANGELIST = "changelist";

    private AppVersion appVersion;

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        assertNotEquals(0, appVersion.compareTo(null));
    }

}