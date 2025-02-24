package com.netflix.frigga.ami;

public class GeneratedTest {

    private static final String EXPECTED_AMI_NAME = "ami-1234567890";
    private static final String EXPECTED_PACKAGE_NAME = "packageName";
    private static final String EXPECTED_VERSION = "version";
    private static final String EXPECTED_BUILD_JOB_NAME = "buildJobName";
    private static final String EXPECTED_BUILD_NUMBER = "buildNumber";
    private static final String EXPECTED_COMMIT = "commit";
    private static final String EXPECTED_CHANGELIST = "changelist";

    private AppVersion appVersion;

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName(EXPECTED_AMI_NAME);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        AppVersion appVersion2 = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = new AppVersion(EXPECTED_PACKAGE_NAME, EXPECTED_VERSION);
        assertNotEquals(0, appVersion.compareTo(null));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}