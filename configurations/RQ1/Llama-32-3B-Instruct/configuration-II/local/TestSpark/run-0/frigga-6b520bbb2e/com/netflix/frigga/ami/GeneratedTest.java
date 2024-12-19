package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameValidPattern_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

    @Test
    public void parseNameInvalidPattern_ReturnsNull() {
        String amiName = "invalid-pattern";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void parseNameEmptyString_ReturnsNull() {
        String amiName = "";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void compareToEqualAppVersions_ReturnsZeroComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("package1");
        appVersion1.setVersion("version1");
        appVersion1.setBuildJobName("buildJobName1");
        appVersion1.setBuildNumber("buildNumber1");
        appVersion1.setCommit("commit1");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("package1");
        appVersion2.setVersion("version1");
        appVersion2.setBuildJobName("buildJobName1");
        appVersion2.setBuildNumber("buildNumber1");
        appVersion2.setCommit("commit1");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToUnequalAppVersions_ReturnsNegativeComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("package1");
        appVersion1.setVersion("version1");
        appVersion1.setBuildJobName("buildJobName1");
        appVersion1.setBuildNumber("buildNumber1");
        appVersion1.setCommit("commit1");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("package2");
        appVersion2.setVersion("version2");
        appVersion2.setBuildJobName("buildJobName2");
        appVersion2.setBuildNumber("buildNumber2");
        appVersion2.setCommit("commit2");

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("package1");
        assertEquals("package1", appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("version1");
        assertEquals("version1", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("buildJobName1");
        assertEquals("buildJobName1", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("buildNumber1");
        assertEquals("buildNumber1", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("commit1");
        assertEquals("commit1", appVersion.getCommit());
    }

}