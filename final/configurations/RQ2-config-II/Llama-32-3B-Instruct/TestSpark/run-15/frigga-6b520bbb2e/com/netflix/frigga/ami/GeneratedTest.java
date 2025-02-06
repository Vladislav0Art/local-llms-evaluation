package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_InvalidAmiName_ReturnsNull() {
        String invalidName = "invalid-name";
        AppVersion appVersion = AppVersion.parseName(invalidName);
        assertNull(appVersion);
    }

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String validName = NameConstants.LATEST_AMI_NAME;
        AppVersion appVersion = AppVersion.parseName(validName);
        assertNotNull(appVersion);
    }

    @Test
    public void compareTo_NullReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = null;
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = appVersion1;
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_LessThan_ExpectedValue_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("version", "build");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_ReturnsExpectedPackage() {
        String expectedName = "com.netflix.frigga.ami";
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedName, appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String expectedVersion = "1.0";
        AppVersion appVersion = new AppVersion("1.0", "build");
        assertEquals(expectedVersion, appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName() {
        String expectedBuildJobName = "build-job-name";
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedBuildJobName, appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber() {
        String expectedBuildNumber = "12345";
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedBuildNumber, appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsExpectedCommit() {
        String expectedCommit = "commit-hash";
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedCommit, appVersion.getCommit());
    }

    @Test
    public void getChangelist_ThrowsNullPointerExceptionOnDeprecatedMethod() {
        try {
            AppVersion appVersion = new AppVersion();
            appVersion.getChangelist();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String expectedToString = "AppVersion{version='1.0', build='build', job='job'}";
        AppVersion appVersion = new AppVersion("1.0", "build");
        assertEquals(expectedToString, appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsExpectedHashCode() {
        int expectedHashcode = 12345;
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedHashcode, appVersion.hashCode());
    }

    @Test
    public void equals_ObjectIsNull_ReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        AppVersion obj2 = null;
        assertFalse(obj1.equals(obj2));
    }

    @Test
    public void equals_ObjectOfDifferentClasses_ReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        Object obj2 = "invalid";
        assertFalse(obj1.equals(obj2));
    }

    @Test
    public void equals_ObjectWithNullValue_ReturnsFalse() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(null);
        assertTrue(appVersion.equals(appVersion));
    }

}