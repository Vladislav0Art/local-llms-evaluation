package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTest {

    @Test
    public void parseNameNullTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameNotNullTest() {
        assertNotNull(AppVersion.parseName("amiName"));
    }

    @Test
    public void compareToEqualToTest() {
        AppVersion appVersion1 = AppVersion.parseName("a");
        AppVersion appVersion2 = AppVersion.parseName("a");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToLessThanTest() {
        AppVersion appVersion1 = AppVersion.parseName("a");
        AppVersion appVersion2 = AppVersion.parseName("b");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToGreaterThanTest() {
        AppVersion appVersion1 = AppVersion.parseName("b");
        AppVersion appVersion2 = AppVersion.parseName("a");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentTypeTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertFalse(appVersion.equals(new Object()));
    }

    @Test
    public void equalsSameContentTest() {
        AppVersion appVersion1 = AppVersion.parseName("name");
        AppVersion appVersion2 = AppVersion.parseName("name");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsDifferentContentTest() {
        AppVersion appVersion1 = AppVersion.parseName("name");
        AppVersion appVersion2 = AppVersion.parseName("diffName");
        assertFalse(appVersion1.equals(appVersion2));
    }

}