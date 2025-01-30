package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNullInputTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameInvalidPatternTest() {
        assertNull(AppVersion.parseName("InvalidPattern"));
    }

    @Test
    public void parseNameValidPatternTest() {
        String amiName = "subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("150", appVersion.getBuildNumber());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
    }

    @Test
    public void compareToTest() {
        AppVersion validAppVersion1 = AppVersion.parseName("subscriberha-2.0.0-h150/WE-WAPP-subscriberha/150");
        AppVersion validAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion1.compareTo(validAppVersion2) > 0);
    }

    @Test
    public void compareToNullTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion.compareTo(null) > 0);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertEquals("subscriberha", validAppVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertEquals("1.0.0", validAppVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertEquals("WE-WAPP-subscriberha", validAppVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertEquals("150", validAppVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.g7f0cae8/WE-WAPP-subscriberha_v2/46");
        assertEquals("g7f0cae8", validAppVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.g7f0cae8/WE-WAPP-subscriberha_v2/46");
        assertEquals("g7f0cae8", validAppVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        String expectedToStringOutput = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=150, changelist=null]";
        assertEquals(expectedToStringOutput, validAppVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertNotNull(validAppVersion.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion validAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        AppVersion validAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h150/WE-WAPP-subscriberha/150");
        assertTrue(validAppVersion1.equals(validAppVersion2));
    }

}