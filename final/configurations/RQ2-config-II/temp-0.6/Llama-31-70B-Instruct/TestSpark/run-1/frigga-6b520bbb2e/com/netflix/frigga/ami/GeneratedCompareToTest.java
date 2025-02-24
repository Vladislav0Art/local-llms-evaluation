package com.netflix.frigga.ami;

public class GeneratedCompareToTest {

    private static final String EXPECTED_AMI_NAME = "ami-1234567890";
    private static final String EXPECTED_PACKAGE_NAME = "packageName";
    private static final String EXPECTED_VERSION = "version";
    private static final String EXPECTED_BUILD_JOB_NAME = "buildJobName";
    private static final String EXPECTED_BUILD_NUMBER = "buildNumber";
    private static final String EXPECTED_COMMIT = "commit";
    private static final String EXPECTED_CHANGELIST = "changelist";

    private AppVersion appVersion;

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        AppVersion appVersion2 = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}