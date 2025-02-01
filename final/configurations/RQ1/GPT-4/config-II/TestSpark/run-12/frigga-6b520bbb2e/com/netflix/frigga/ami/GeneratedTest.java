package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNullTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameInvalidTextTest() {
        assertNull(AppVersion.parseName("invalidText"));
    }

    @Test
    public void parseNameValidTextTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals(null, appVersion.getCommit());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        String expectedString = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=586499, changelist=null]";
        assertEquals(expectedString, appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertTrue(appVersion.hashCode() != 0);
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertEquals(1, appVersion.compareTo(null));
    }

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsDifferentClassTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertFalse(appVersion.equals(new Object()));
    }

}