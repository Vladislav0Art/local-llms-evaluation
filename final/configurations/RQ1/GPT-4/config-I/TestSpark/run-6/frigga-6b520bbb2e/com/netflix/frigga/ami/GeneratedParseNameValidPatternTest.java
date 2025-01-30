package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidPatternTest {

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

}