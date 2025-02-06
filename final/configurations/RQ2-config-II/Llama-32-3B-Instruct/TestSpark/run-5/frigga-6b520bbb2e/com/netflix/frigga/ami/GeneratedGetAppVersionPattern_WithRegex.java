package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_WithRegex {

    @Test
    public void getAppVersionPattern_WithRegex() {
        String patternString = "\\d+\\.\\d+";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.0");
        assertTrue(matcher.matches());
    }

}