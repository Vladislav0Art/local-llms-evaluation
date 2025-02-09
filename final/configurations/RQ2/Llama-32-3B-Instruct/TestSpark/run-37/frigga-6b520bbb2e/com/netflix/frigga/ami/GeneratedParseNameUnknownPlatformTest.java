package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameUnknownPlatformTest {

    @Test
    public void parseNameUnknownPlatformTest() {
        String amiName = "unknown-platform:latest";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}