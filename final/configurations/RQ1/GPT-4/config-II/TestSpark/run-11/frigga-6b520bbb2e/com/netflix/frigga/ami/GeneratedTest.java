package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNullAmiNameTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameInvalidAmiNameTest() {
        assertNull(AppVersion.parseName("not-valid-0.0.0-123459"));
    }

    @Test
    public void parseNameValidAmiNameOldSchemaTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertEquals("appname", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("123456", appVersion.getBuildNumber());
        assertNull(appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
    }

    @Test
    public void parseNameValidAmiNameNewSchemaTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertEquals("appname", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("123456", appVersion.getBuildNumber());
        assertEquals("JobName", appVersion.getBuildJobName());
        assertEquals("gitHash", appVersion.getCommit());
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("appname-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("appname-1.0.0-h123456");

        assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertTrue(appVersion.compareTo(null) == 1);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertEquals("gitHash", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertEquals("AppVersion [packageName=appname, version=1.0.0, buildJobName=JobName, buildNumber=123456, changelist=gitHash]", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456.gitHash/JobName/234");

        assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("appname-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("appname-1.0.0-h123456");

        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("appname-1.0.0-h123456");

        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsMismatchTest() {
        AppVersion appVersion1 = AppVersion.parseName("appname-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("appname1-1.0.0-h123456");

        assertFalse(appVersion1.equals(appVersion2));
    }

}