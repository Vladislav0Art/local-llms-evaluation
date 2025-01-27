package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ExistingName

    Test() {
        String amiName = "1.0-123456789";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("123456789", appVersion.getBuildNumber());
    }

    @Test
    public void parseName_NonExistentName

    Test() {
        String amiName = "99999";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void compareTo_MatchingVersions

    ReturnZero Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456789");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_DifferentVersions

    ReturnNegativeResult Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456780");
        int result = version1.compareTo(version2);
        assertEquals(-1, result);
    }

    @Test
    public void compareTo_MismatchedVersions

    ReturnPositiveResult Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("2.0-123456789");
        int result = version1.compareTo(version2);
        assertEquals(1, result);
    }

    @Test
    public void getAppVersionPattern_ReturnsValidPattern

    Test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0-123456789").find());
    }

    @Test
    public void getPackageName_ReturnsExpectedPackage

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedVersion

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("build-job-123456789", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("123456789", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsExpectedCommitId

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("789", appVersion.getCommit());
    }

    @Test
    public void getChangelist_ReturnsExpectedChangelistId

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("12345", appVersion.getChangelist());
    }

    @Test
    public void toString_ReturnsExpectedToStringRepresentation

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        String expectedToString = "com.netflix.frigga.ami.AppVersion{version='1.0', buildNumber='123456789'}";
        assertEquals(expectedToString, appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsExpectedHashCode

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        int expectedHashCode = 245;
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

    @Test
    public void equals_MatchesExactComparison

    Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456789");
        assertTrue(version1.equals(version2));
    }

    @Test
    public void equals_DoesNotMatchDifferentBuildNumbers

    Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456780");
        assertFalse(version1.equals(version2));
    }

}