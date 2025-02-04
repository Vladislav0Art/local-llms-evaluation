package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameMatchesPattern {

    @Test
    public void parseNameMatchesPattern() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed);
        assertEquals("subscriberha", parsed.packageName);
        assertEquals("1.0.0-586499", parsed.version);
    }

}