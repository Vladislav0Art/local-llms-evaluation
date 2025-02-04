package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName_InvalidAppVersionPattern_ReturnsNull {

    @Test
    public void testParseName_InvalidAppVersionPattern_ReturnsNull() {
        String amiName = "subscriberha-1.0.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}