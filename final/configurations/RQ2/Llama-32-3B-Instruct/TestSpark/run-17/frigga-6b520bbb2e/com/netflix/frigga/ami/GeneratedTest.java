package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseName_MissingPrefix_ReturnsNull() {
        String amiName = "ami-0c123456";
        assertNull(AppVersion.parseName(amiName));
    }

    @Test
    public void parseName_ValidName_ReturnsAppVersion() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(amiName, appVersion.toString());
    }

    @Test
    public void parseName_MalformedName_ThrowsRegexException() {
        String amiName = "InvalidName";
        try {
            AppVersion.parseName(amiName);
            fail("Expected RegexException");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_DifferentBuildNumbers_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("ami-0c123456abcdefg");
        AppVersion appVersion2 = new AppVersion("ami-0c123457abcdefg");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_DifferentCommitValues_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("ami-0c123456abcdefg");
        AppVersion appVersion2 = new AppVersion("ami-0c123456abcdefh");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPattern_ReturnsValidRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matches("ami-[a-f0-9]+"));
    }

    @Test
    public void getPackageName_ReturnsPrefix() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals("ami", AppVersion.parseName(amiName).getPackageName());
    }

    @Test
    public void getVersion_ReturnsBuildJobName() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals("buildJobName", AppVersion.parseName(amiName).getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsSameAsGetVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals(AppVersion.parseName(amiName).getVersion(), AppVersion.parseName(amiName).getBuildJobName());
    }

    @Test
    public void getCommit_ReturnsSameAsGetVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals(AppVersion.parseName(amiName).getVersion(), AppVersion.parseName(amiName).getCommit());
    }

    @Test
    public void getBuildNumber_ReturnsLastSixCharactersOfVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals("abcdefg", AppVersion.parseName(amiName).getBuildNumber());
    }

    @Test
    public void toString_ReturnsValidString() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertTrue(appVersion.toString().matches("^ami-[a-f0-9]+"));
    }

    @Test
    public void hashCode_ReturnsSameAsToStringHashCode() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(appVersion.hashCode(), appVersion.toString().hashCode());
    }

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        AppVersion appVersion2 = new AppVersion(appVersion1);
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_DifferentBuildNumbers_ReturnsFalse() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        AppVersion appVersion2 = new AppVersion("ami-0c123456abcdefh");
        assertFalse(appVersion1.equals(appVersion2));
    }

}