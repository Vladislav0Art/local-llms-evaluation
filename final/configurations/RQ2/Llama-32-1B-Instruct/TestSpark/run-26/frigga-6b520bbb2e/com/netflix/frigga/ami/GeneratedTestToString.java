package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestToString {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile("([a-zA-Z0-9_]+)\\.(?:(?:[a-z]{2}\\.|(?:(?:\\d{4}|\\d{2}\\d))\\d{2}))");

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion("aws-november-2017.1");
        assertEquals("[APP_VERSION][aws-november-2017.1]", appVersion.toString());
    }

}