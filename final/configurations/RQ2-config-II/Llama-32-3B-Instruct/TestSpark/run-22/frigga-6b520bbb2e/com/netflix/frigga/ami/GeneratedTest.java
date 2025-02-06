package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_UnknownFormat

    ReturnsNull() {
        AppVersion result = AppVersion.parseName("unknown");
        assertNull(result);
    }

    @Test
    public void parseName_SameVersionReturnsSameObject() {
        AppVersion version1 = AppVersion.parseName("1.0-1234");
        AppVersion version2 = AppVersion.parseName("1.0-1234");
        assertEquals(version1, version2);
    }

    @Test
    public void parseName_MultipleVersionsReturnsSingleOne() {
        AppVersion version1 = AppVersion.parseName("1.0-1234");
        AppVersion result = AppVersion.parseName("2.0-5678");
        assertNull(result);
    }

    @Test
    public void getPackageName_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getPackageName());
    }

    @Test
    public void getPackageName_NonEmptyString

    ReturnsNonEmptyString() {
        String packageName = "my.package";
        AppVersion result = new AppVersion(packageName);
        assertEquals(packageName, result.getPackageName());
    }

    @Test
    public void getVersion_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getVersion());
    }

    @Test
    public void getVersion_NonEmptyString

    ReturnsNonEmptyString() {
        String version = "1.0";
        AppVersion result = new AppVersion(version);
        assertEquals(version, result.getVersion());
    }

    @Test
    public void getBuildJobName_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getBuildJobName());
    }

    @Test
    public void getBuildNumber_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getBuildNumber());
    }

    @Test
    public void getCommit_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getCommit());
    }

    @Test
    public void getAppVersionPattern

    NeverMatches() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertFalse(pattern.matcher("unknown").find());
    }

    @Test
    public void getAppVersionPattern_MatchesValidFormat

    ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0-1234").find());
    }

}