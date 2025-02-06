package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_AmiNameIsParsedCorrectly() {
        String amiName = "ubuntu/16.04/amazonLinux2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("ubuntu", appVersion.getPackageName());
        assertEquals(4, appVersion.getVersion().length());
    }

    @Test
    public void parseName_AmiNameIsParsedCorrectly_WithChangelist() {
        String amiName = "ubuntu/16.04/amazonLinux2/changelist123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("ubuntu", appVersion.getPackageName());
        assertEquals(4, appVersion.getVersion().length());
    }

    @Test
    public void parseName_AmiNameIsParsedCorrectly_WithCommit() {
        String amiName = "ubuntu/16.04/amazonLinux2/1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("ubuntu", appVersion.getPackageName());
        assertEquals(4, appVersion.getVersion().length());
    }

    @Test
    public void parseName_InvalidAmiName_throwsException() {
        String amiName = "invalid";
        try {
            AppVersion.parseName(amiName);
            fail();
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void compareVersions_AmiVersion1IsLessThanAmiVersion2() {
        AppVersion appVersion1 = new AppVersion("ubuntu", 16, 4);
        AppVersion appVersion2 = new AppVersion("ubuntu", 17, 4);
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

    @Test
    public void compareVersions_AmiVersion1IsGreaterThanAmiVersion2() {
        AppVersion appVersion1 = new AppVersion("ubuntu", 16, 4);
        AppVersion appVersion2 = new AppVersion("ubuntu", 15, 4);
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(1, result);
    }

    @Test
    public void compareVersions_AmiVersionIsEqual() {
        AppVersion appVersion1 = new AppVersion("ubuntu", 16, 4);
        AppVersion appVersion2 = new AppVersion("ubuntu", 16, 4);
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

    @Test
    public void getAppVersionPattern_PatternIsCreatedCorrectly() {
        String amiName = "ubuntu/16.04/amazonLinux2";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ubuntu/16.04/amazonLinux2").find());
    }

}