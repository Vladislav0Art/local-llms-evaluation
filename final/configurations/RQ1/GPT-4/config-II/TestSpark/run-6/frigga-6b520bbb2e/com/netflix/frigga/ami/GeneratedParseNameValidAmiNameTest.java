package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

}