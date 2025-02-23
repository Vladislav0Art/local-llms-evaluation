package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
    }

}