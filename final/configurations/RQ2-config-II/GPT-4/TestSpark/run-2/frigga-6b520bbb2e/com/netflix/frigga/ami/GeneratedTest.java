package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion appVersion = AppVersion.parseName(null);
    }

    @Test
    public void compareToEqualVersionsTest() {
        AppVersion appVersion1 = AppVersion.parseName("amiName");
        AppVersion appVersion2 = AppVersion.parseName("amiName");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedPackageName", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedVersion", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedBuildJobName", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedBuildNumber", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedCommit", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("ExpectedChangelist", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSelfTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsDifferentClassTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertFalse(appVersion.equals(new String("Sample string")));
    }

}