package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidInputTest {

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

}