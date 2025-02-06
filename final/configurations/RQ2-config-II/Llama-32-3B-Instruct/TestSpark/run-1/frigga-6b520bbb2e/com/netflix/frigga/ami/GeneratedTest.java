package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName(""));
    }

    @Test
    public void parseName_ValidAmarthostname_ReturnsAppVersionObject() {
        String amiName = "ami-0c103043abf3aef9f6c5b15d8d42ad4e";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_MalformedAmarthostname_ThrowsParseException() {
        String amiName = "ami-0c103043abf3aef9f6c5b15d8d42ad4";
        assertThrows(ParseException.class, () -> AppVersion.parseName(amiName));
    }

    @Test
    public void parseName_InvalidAmarthostname_ThrowsParseException() {
        String amiName = "ami-0c103043abf3aef9f6c5b15d8d42ad46";
        assertThrows(ParseException.class, () -> AppVersion.parseName(amiName));
    }

    @Test
    public void getAppVersionPattern_ReturnsExpectedPattern() {
        String expectedPattern = "^[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]+-(?:[a-zA-Z0-9.-]+)\\.[a-zA-Z0-9]+$";
        Pattern actualPattern = AppVersion.getAppVersionPattern();
        assertTrue(actualPattern.matcher("example-1234567890").find());
    }

    @Test
    public void getPackageName_ReturnsExpectedPackageName() {
        String packageName = "com.example.app";
        assertEquals(packageName, AppVersion.parseName("ami-1234567890").getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = "1234567890";
        assertEquals(version, AppVersion.parseName("ami-1234567890").getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName() {
        String buildJobName = "build12345";
        assertEquals(buildJobName, AppVersion.parseName("ami-1234567890").getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber() {
        String buildNumber = "1234567890";
        assertEquals(buildNumber, AppVersion.parseName("ami-1234567890").getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsExpectedCommit() {
        String commit = "abc123def456";
        assertEquals(commit, AppVersion.parseName("ami-1234567890").getCommit());
    }

    @Test
    public void getChangelist_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> AppVersion.parseName("ami-1234567890").getChangelist());
    }

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String amiName = "ami-1234567890";
        assertEquals(amiName, AppVersion.parseName(amiName).toString());
    }

    @Test
    public void hashCode_ReturnsExpectedHashCode() {
        int expectedHashCode = 1234567890;
        assertEquals(expectedHashCode, AppVersion.parseName("ami-1234567890").hashCode());
    }

    @Test
    public void equals_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName("ami-1234567890").equals(null));
    }

}