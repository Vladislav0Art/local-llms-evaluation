package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseName_EmptyStringReturnsNull() {
        String amiName = "";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void parseName_MatchesPatternReturnsValidAppVersion() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("-123456", appVersion.getCommit());
    }

    @Test
    public void parseName_MatchesPatternReturnsChangelist() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion.getChangelist());
        assertEquals("123456", appVersion.getChangelist());
    }

    @Test
    public void parseName_DoesNotMatchPatternReturnsNull() {
        String amiName = "1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void compareAppVersions_SameValuesReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.0");
        appVersion2.setCommit("123456");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareAppVersions_DifferentValuesReturnsNegativeOrPositive() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.1");
        appVersion2.setCommit("123456");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals("build-job-123456", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals("123456", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertEquals("123456", appVersion.getCommit());
    }

    @Test
    public void getChangelist_ReturnsExpectedValue() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertNotNull(appVersion.getChangelist());
        assertEquals("123456", appVersion.getChangelist());
    }

    @Test
    public void toString_ReturnsExpectedString() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(amiName);
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsUniqueValue() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.0");
        appVersion2.setCommit("123456");
        assertEquals(0, appVersion1.hashCode());
        assertEquals(0, appVersion2.hashCode());
    }

    @Test
    public void equals_ReturnsExpectedValue() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.0");
        appVersion2.setCommit("123456");
        assertTrue(appVersion1.equals(appVersion2));
    }

}