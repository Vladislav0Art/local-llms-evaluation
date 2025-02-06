package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_WithoutRegex {

    @Test
    public void getAppVersionPattern_WithoutRegex() {
        String patternString = ".*";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("my-our-app:1.0");
        assertTrue(matcher.matches());
    }

}