package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidPatternTest() {
        String validPattern = "subscriberha-1.0.0-h586499";
        AppVersion parsedName = AppVersion.parseName(validPattern);

        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertNull(parsedName.getBuildJobName());
        assertEquals("586499", parsedName.getBuildNumber());
        assertNull(parsedName.getCommit());
    }

    @Test
    public void parseNameInvalidPatternTest() {
        String invalidPattern = "invalid-pattern";
        AppVersion parsedName = AppVersion.parseName(invalidPattern);

        assertNull(parsedName);
    }

    @Test
    public void parseNameNullStringTest() {
        AppVersion parsedName = AppVersion.parseName(null);

        assertNull(parsedName);
    }

    @Test
    public void compareToTest() {
        String validPattern = "subscriberha-1.0.0-h586499";
        AppVersion appVersion1 = AppVersion.parseName(validPattern);
        AppVersion appVersion2 = AppVersion.parseName(validPattern);

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToNullTest() {
        String validPattern = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(validPattern);

        assertEquals(1, appVersion.compareTo(null));
    }

}