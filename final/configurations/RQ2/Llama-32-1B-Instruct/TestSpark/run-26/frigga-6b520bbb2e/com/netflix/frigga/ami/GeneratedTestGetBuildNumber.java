package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile("([a-zA-Z0-9_]+)\\.(?:(?:[a-z]{2}\\.|(?:(?:\\d{4}|\\d{2}\\d))\\d{2}))");

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion("aws-november-2017.1");
        assertEquals("12345", appVersion.getBuildNumber());
    }

}