package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidAmeiNameReturnsCorrectAppVersion() {
        String amiName = "1.0-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

    @Test
    public void parseNameInvalidAmeiNameThrowsException() {
        String amiName = "invalid-amei-name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void getPackageNameReturnsCorrectPackage() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals(NameConstants.APP_VERSION, appVersion.getPackageName());
    }

    @Test
    public void getVersionReturnsCorrectVersion() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameReturnsCorrectBuildJobName() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("build-1234567890", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberReturnsCorrectBuildNumber() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitReturnsCorrectCommitHash() {
        AppVersion appVersion = new AppVersion("1.0-1234567890");
        assertEquals("1234567890", appVersion.getCommit());
    }

    @Test
    public void getAppVersionPatternReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0-1234567890").find());
    }

    @Test
    public void getPackageNamesAreOrderedCorrectly() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("2.0-9876543210");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getHashesAreOrderedCorrectly() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("2.0-9876543210");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}