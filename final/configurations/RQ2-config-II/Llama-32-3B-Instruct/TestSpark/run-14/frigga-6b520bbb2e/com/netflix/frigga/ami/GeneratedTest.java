package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void parseName_AnyValidNameReturnsCorrectAppVersion() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.getVersion());
        assertNotNull(appVersion.getBuildNumber());
        assertNotNull(appVersion.getCommit());
    }

    @Test
    public void parseName_InvalidNameThrowsException() {
        String amiName = " invalid name";
        try {
            AppVersion.parseName(amiName);
            fail("Expected an exception");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void compareVersions_SameVersionEqualsZero() {
        AppVersion version1 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        AppVersion version2 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void compareVersions_DifferentBuildJobNameNotEqual() {
        AppVersion version1 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        AppVersion version2 = new AppVersion("1.0.0-RC2", "build789", "commit456");
        assertEquals(-1, version1.compareTo(version2));
    }

    @Test
    public void compareVersions_DifferentCommitNotEqual() {
        AppVersion version1 = new AppVersion("1.0.0-RC2", "build123", "commit456");
        AppVersion version2 = new AppVersion("1.0.0-RC2", "build123", "commit789");
        assertEquals(-1, version1.compareTo(version2));
    }

    @Test
    public void getPackageName_AnyValidNameReturnsCorrectPackageName() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(NameConstants.AMI_PREFIX + amiName, appVersion.getPackageName());
    }

    @Test
    public void getBuildJobName_AnyValidNameReturnsCorrectBuildJobName() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertNotNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_AnyValidNameReturnsCorrectBuildNumber() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertNotNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_AnyValidNameReturnsCorrectCommit() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertNotNull(appVersion.getCommit());
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0.0-RC2").matches());
    }

}