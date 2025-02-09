package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidFormatTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("app", appVersion.getPackageName());
        assertEquals("2.5.0", appVersion.getVersion());
        assertEquals("h82", appVersion.getBuildJobName());
        assertEquals("8af1b42", appVersion.getCommit());
    }

    @Test
    public void parseNameInValidFormatTest() {
        AppVersion.parseName("invalid-name");
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        AppVersion appVersion2 = AppVersion.parseName("app-2.5.0-h83.8af1b42");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("app", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("2.5.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("h82", appVersion.getBuildJobName());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("8af1b42", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("8af1b42", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("app-2.5.0-h82.8af1b42", appVersion.toString());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        AppVersion appVersion2 = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals(appVersion.hashCode(), "app-2.5.0-h82.8af1b42".hashCode());
    }

}