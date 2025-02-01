package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNullInputTest() {
        AppVersion parsedAppVersion = AppVersion.parseName(null);

        assertNull(parsedAppVersion);
    }

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion parsedAppVersion = AppVersion.parseName("invalid-input");

        assertNull(parsedAppVersion);
    }

    @Test
    public void parseNameValidInputTest() {
        AppVersion parsedAppVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertNotNull(parsedAppVersion);
        assertEquals("subscriberha", parsedAppVersion.getPackageName());
        assertEquals("1.0.0", parsedAppVersion.getVersion());
        assertEquals("586499", parsedAppVersion.getBuildNumber());
        assertNull(parsedAppVersion.getCommit());
        assertNull(parsedAppVersion.getBuildJobName());
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
        assertEquals(
                "[" + NameConstants.NAME_HYPHEN_CHARS + "]+-[0-9.a-zA-Z~]+-\\w+(?:\\.\\w+)?(?:\\/[" + NameConstants.NAME_HYPHEN_CHARS + "]+\\/[0-9]+)?",
                AppVersion.getAppVersionPattern().pattern()
        );
    }

    @Test
    public void compareToSameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(0, appVersion.compareTo(appVersion));
    }

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(1, appVersion.compareTo(null));
    }

    @Test
    public void compareToDifferentTest() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.1-h586550");

        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void hashCodeTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(parsedAppVersion1.hashCode(), parsedAppVersion2.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertTrue(parsedAppVersion1.equals(parsedAppVersion2));
    }

    @Test
    public void equalsDifferentTest() {
        AppVersion parsedAppVersion1 = AppVersion.parseName("subscriberha-1.0.0-h586499");
        AppVersion parsedAppVersion2 = AppVersion.parseName("subscriberha-1.0.1-h586499");

        assertFalse(parsedAppVersion1.equals(parsedAppVersion2));
    }

}