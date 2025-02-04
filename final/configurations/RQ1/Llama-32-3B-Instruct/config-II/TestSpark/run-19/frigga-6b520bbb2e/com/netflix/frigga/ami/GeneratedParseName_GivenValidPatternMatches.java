package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_GivenValidPatternMatches {

    @Test
    public void parseName_GivenValidPatternMatches() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.packageName);
        assertEquals("1.0.0-586499", appVersion.version);
    }

}