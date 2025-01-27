package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameValidAmeiNameReturnsCorrectAppVersion {

    @Test
    public void parseNameValidAmeiNameReturnsCorrectAppVersion() {
        String amiName = "1.0-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

}