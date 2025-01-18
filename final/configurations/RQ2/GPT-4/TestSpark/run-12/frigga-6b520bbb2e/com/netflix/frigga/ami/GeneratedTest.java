package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertEquals("appName", appVersion.getPackageName());
        assertEquals("version", appVersion.getVersion());
        assertEquals("buildJob", appVersion.getBuildJobName());
        assertEquals("buildNumber", appVersion.getBuildNumber());
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void parseNameInvalidNameTest() {
        AppVersion.parseName("invalidName");
    }

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = AppVersion.parseName("AppName1-version1-buildJob1-buildNumber1-commit1");
        AppVersion appVersion2 = AppVersion.parseName("AppName2-version2-buildJob2-buildNumber2-commit2");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToLessTest() {
        AppVersion appVersion1 = AppVersion.parseName("AppName2-version2-buildJob2-buildNumber2-commit2");
        AppVersion appVersion2 = AppVersion.parseName("AppName1-version1-buildJob1-buildNumber1-commit1");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("AppName-version-buildJob-buildNumber-commit");
        AppVersion appVersion2 = AppVersion.parseName("AppName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsSameValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        AppVersion appVersion2 = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsDifferentTypeTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertFalse(appVersion.equals("NotAppVersionObject"));
    }

}