package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String appName = "application1";
        AppVersion result = AppVersion.parseName(appName);
        assertNotNull(result);
    }

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("app1");
        AppVersion version2 = AppVersion.parseName("app2");
        assertTrue(version1.compareTo(version2) != 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        String appName = "package";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        String appName = "version1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        String appName = "job1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        String appName = "number1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        String appName = "commit1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        String appName = "changelist1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        String appName = "toString1";
        AppVersion appVersion = AppVersion.parseName(appName);
        assertEquals(appName, appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        String appName1 = "hash1";
        String appName2 = "hash2";
        AppVersion appVersion1 = AppVersion.parseName(appName1);
        AppVersion appVersion2 = AppVersion.parseName(appName2);
        // Two different AppVersions should not have the same hashcode
        assertTrue(appVersion1.hashCode() != appVersion2.hashCode());
    }

    @Test
    public void equalsTest() {
        String appName = "equals1";
        AppVersion appVersion1 = AppVersion.parseName(appName);
        AppVersion appVersion2 = AppVersion.parseName(appName);
        // Two AppVersions with same name should be equal
        assertTrue(appVersion1.equals(appVersion2));
    }

}