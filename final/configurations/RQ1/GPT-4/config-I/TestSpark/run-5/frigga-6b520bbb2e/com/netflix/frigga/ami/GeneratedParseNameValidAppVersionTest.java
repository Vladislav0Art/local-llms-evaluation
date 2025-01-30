package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameValidAppVersionTest {

    @Test
    public void parseNameValidAppVersionTest() {
        String amiName = "subscriberha-1.0.0-h586499";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertNull(appVersion.getCommit());
    }

}