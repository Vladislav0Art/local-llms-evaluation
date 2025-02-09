package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "ami-App1-v1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameInvalidInputTest() {
        String amiName = "ami-Invalid";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App1-v1.0");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App2-v2.0");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        assertEquals("App1", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        assertEquals("v1.0", appVersion.getVersion());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        assertEquals("ami-App1-v1.0", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        int hashCode = appVersion.hashCode();
        assertNotNull(hashCode);
    }

    @Test
    public void equalsEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App1-v1.0");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App2-v2.0");
        assertFalse(appVersion1.equals(appVersion2));
    }

}