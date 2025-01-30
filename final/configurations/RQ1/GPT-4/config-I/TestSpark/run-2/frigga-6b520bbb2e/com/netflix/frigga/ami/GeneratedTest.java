package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTestValidAmiName() {
        AppVersion result = AppVersion.parseName("myApp-1.0.0-h123456");

        assertNotNull(result);
        assertEquals("myApp", result.getPackageName());
        assertEquals("1.0.0", result.getVersion());
        assertEquals("123456", result.getBuildNumber());
        assertNull(result.getCommit());
        assertNull(result.getBuildJobName());
    }

    @Test
    public void parseNameTestInvalidAmiName() {
        AppVersion result = AppVersion.parseName("invalid-ami-name");
        assertNull(result);
    }

    @Test
    public void parseNameTestNullAmiName() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

    @Test
    public void compareToTestSameReference() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertEquals(0, appVersion.compareTo(appVersion));
    }

    @Test
    public void compareToTestNullObject() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");

        int compare = appVersion.compareTo(null);
        assertEquals(1, compare);
    }

    @Test
    public void compareToTestDifferentAppVersions() {
        AppVersion appVersion1 = AppVersion.parseName("myApp-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("myApp-2.0.0-h123456");

        int compare = appVersion1.compareTo(appVersion2);
        assertTrue(compare != 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertTrue(appVersion.hashCode() != 0);
    }

    @Test
    public void equalsTestSameReference() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsTestNullObject() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsTestDifferentClass() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        assertFalse(appVersion.equals(new Object()));
    }

    @Test
    public void equalsTestDifferentObject() {
        AppVersion appVersion1 = AppVersion.parseName("myApp-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("myApp-2.0.0-h123456");
        assertFalse(appVersion1.equals(appVersion2));
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");
        String expectedToString = "AppVersion [packageName=myApp, version=1.0.0, buildJobName=null, buildNumber=123456, changelist=null]";
        assertEquals(expectedToString, appVersion.toString());
    }

}