package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

    @Test
    public void parseNameInvalidTest() {
        AppVersion appVersion = AppVersion.parseName("invalidNameFormat");
        assertNull(appVersion);
    }

    @Test
    public void parseNameValidTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertNotNull(appVersion);
        assertEquals(appVersion.getPackageName(), "subscriberha");
        assertEquals(appVersion.getVersion(), "1.0.0");
        assertEquals(appVersion.getBuildNumber(), "586499");
        assertEquals(appVersion.getBuildJobName(), "WE-WAPP-subscriberha");
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586500/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

    @Test
    public void compareToLessTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500/WE-WAPP-subscriberha/150");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586500/WE-WAPP-subscriberha/150");
        assertTrue(appVersion1.compareTo(null) > 0);
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertEquals(appVersion1, appVersion2);
    }

    @Test
    public void notEqualsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586500/WE-WAPP-subscriberha/150");
        assertNotEquals(appVersion1, appVersion2);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        String expectedString = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=586499, changelist=null]";
        assertEquals(expectedString, appVersion.toString());
    }

}