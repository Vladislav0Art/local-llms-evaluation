package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("valid-app-name");
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullTest() {
        AppVersion.parseName(null);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version-sample");
        AppVersion appVersion2 = AppVersion.parseName("app-version-sample");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("app-version-sample", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertNotNull(appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("build-job-name", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("build-number", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertEquals("changelist", appVersion.getChangelist());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("app-version-sample");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version-sample");
        AppVersion appVersion2 = AppVersion.parseName("app-version-sample");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version-sample");
        AppVersion appVersion2 = AppVersion.parseName("app-version-sample");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}