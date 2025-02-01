package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
    }

}