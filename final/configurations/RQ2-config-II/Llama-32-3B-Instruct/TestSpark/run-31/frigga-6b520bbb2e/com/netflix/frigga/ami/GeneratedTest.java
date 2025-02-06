package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String invalidFormat = " InvalidFormat";
        assertNull(AppVersion.parseName(invalidFormat));
    }

    @Test
    public void parseName_ValidFormat_ReturnsParsedAppVersion() {
        String validFormat = "com.netflix.frigga.ami:1.2.3";
        AppVersion parsedAppVersion = AppVersion.parseName(validFormat);
        assertNotNull(parsedAppVersion);
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_DifferentBuildNumber_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga.ami:1.2.3");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga.ami:1.2.4");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("com.netflix.frigga.ami", appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("buildJobName", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertEquals("1.2.3", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        assertEquals("commitValue", appVersion.getCommit());
    }

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("com.netflix.frigga.ami:1.2.3").find());
    }

    @Test
    public void toString_AppVersionReturnsToString() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCode_AppVersionReturnsHashCode() {
        AppVersion appVersion = new AppVersion();
        assertEquals(0, appVersion.hashCode());
    }

    @Test
    public void equals_AppVersionEqualsToSelf_ReturnsTrue() {
        AppVersion appVersion = new AppVersion();
        assertTrue(appVersion.equals(appVersion));
    }

}