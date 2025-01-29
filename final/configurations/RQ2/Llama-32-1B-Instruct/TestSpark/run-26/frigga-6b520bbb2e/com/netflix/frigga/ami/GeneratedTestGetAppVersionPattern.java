package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetAppVersionPattern {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile("([a-zA-Z0-9_]+)\\.(?:(?:[a-z]{2}\\.|(?:(?:\\d{4}|\\d{2}\\d))\\d{2}))");

    @Test
    public void testGetAppVersionPattern() {
        String pattern = APP_VERSION_PATTERN.toString();
        String expected = "[APP_VERSION]";
        Assert.assertTrue(pattern.equals(expected));
    }

}