package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidPatternTest {

    @Test
    public void parseNameValidPatternTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assert appVersion != null;
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertNull(appVersion.getBuildJobName());
        assertEquals("586499", appVersion.getBuildNumber());
    }

}