package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "ami-1234abcde7890fghi123";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed);
    }

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        String amiName = "invalid-input";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_DifferentAppVersion_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("ami-1234abcde7890fghi123");
        int result = appVersion1.compareTo(appVersion2);
        assertLessThan(0, result);
    }

    @Test
    public void getAppVersionPattern_ValidInput_ReturnsNonNullPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_ValidAppVersion_ReturnsExpectedPackageName() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String packageName = appVersion.getPackageName();
        assertEquals(NameConstants.APP_NAME, packageName);
    }

    @Test
    public void getVersion_ValidAppVersion_ReturnsExpectedVersion() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String version = appVersion.getVersion();
        assertEquals("1.2.3.4", version);
    }

    @Test
    public void getBuildJobName_ValidAppVersion_ReturnsExpectedBuildJobName() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-job-name", buildJobName);
    }

    @Test
    public void getBuildNumber_ValidAppVersion_ReturnsExpectedBuildNumber() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("123456", buildNumber);
    }

    @Test
    public void getCommit_ValidAppVersion_ReturnsExpectedCommit() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

    @Test
    public void getChangelist_DeprecatedReturnsNull() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        assertEquals(null, appVersion.getChangelist());
    }

    @Test
    public void toString_ValidAppVersion_ReturnsExpectedStringRepresentation() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String toString = appVersion.toString();
        assertNotNull(toString);
    }

    @Test
    public void hashCode_ValidAppVersion_ReturnsExpectedHashCode() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        int hashcode = appVersion.hashCode();
        assertTrue(hashCode >= 0);
    }

    @Test
    public void equals_ValidAppVersion_ReturnsExpectedEqualsResult() {
        AppVersion appVersion1 = new AppVersion("ami-1234abcde7890fghi123");
        AppVersion appVersion2 = new AppVersion("ami-1234abcde7890fghi123");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_DifferentAppVersion_ReturnsExpectedNotEqualsResult() {
        AppVersion appVersion1 = new AppVersion("ami-1234abcde7890fghi123");
        AppVersion appVersion2 = new AppVersion("ami-12345abcde7890fghi123");
        assertFalse(appVersion1.equals(appVersion2));
    }

}