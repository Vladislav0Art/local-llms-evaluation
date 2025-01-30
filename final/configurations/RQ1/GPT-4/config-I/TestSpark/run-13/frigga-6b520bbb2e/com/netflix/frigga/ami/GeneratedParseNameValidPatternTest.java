package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidPatternTest {

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

}