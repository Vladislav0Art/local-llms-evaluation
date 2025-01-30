package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest_validInput_hBuildNumber() {
        String amiName = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertNull(appVersion.getCommit());
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void parseNameTest_validInput_noBuildNumber() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertNull(appVersion.getCommit());
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void parseNameTest_invalidInput() {
        String amiName = "invalidInput";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNull(appVersion);
    }

    @Test
    public void parseNameTest_nullInput() {
        AppVersion appVersion = AppVersion.parseName(null);

        assertNull(appVersion);
    }

    @Test
    public void compareToTest_equal() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToTest_different() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.1-586499");

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareToTest_otherNull() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(1, appVersion1.compareTo(null));
    }

    @Test
    public void getCommitTest_validCommit() {
        String amiName = "subscriberha-1.0.0-586499.gcommit";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest_validCommit() {
        String amiName = "subscriberha-1.0.0-586499.gcommit";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertEquals("commit", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        String expected = "AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=null, buildNumber=586499, changelist=null]";
        assertEquals(expected, appVersion.toString());
    }

    @Test
    public void hashCodeAndEqualsTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586499");

        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
        assertTrue(appVersion1.equals(appVersion2));
    }

}