package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseNameValidFormatTest() {
        String validAmiName = "some-valid-name";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameInvalidFormatTest() {
        String invalidAmiName = "invalid_name";
        AppVersion.parseName(invalidAmiName);
    }

    @Test
    public void compareToBiggerVersionTest() {
        AppVersion version1 = AppVersion.parseName("version-1.0");
        AppVersion version2 = AppVersion.parseName("version-2.0");
        assertTrue(version1.compareTo(version2) < 0);
    }

    @Test
    public void compareToEqualVersionsTest() {
        AppVersion version1 = AppVersion.parseName("version-1.0");
        AppVersion version2 = AppVersion.parseName("version-1.0");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher(appVersion.getPackageName()).matches());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0");
        assertEquals("version", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0");
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-BuildJob");
        assertEquals("BuildJob", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-100");
        assertEquals("100", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-a1b2c3");
        assertEquals("a1b2c3", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-123");
        assertEquals("123", appVersion.getCommit());
    }

    @Test
    public void toStringTest() {
        String amiName = "version-1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.toString());
    }

    @Test
    public void hashCodeDistinctValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("version-1.0");
        AppVersion appVersion2 = AppVersion.parseName("version-1.1");
        assertTrue(appVersion1.hashCode() != appVersion2.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("version-1.0");
        AppVersion appVersion2 = AppVersion.parseName("version-1.0");
        assertEquals(appVersion1, appVersion2);
    }

}