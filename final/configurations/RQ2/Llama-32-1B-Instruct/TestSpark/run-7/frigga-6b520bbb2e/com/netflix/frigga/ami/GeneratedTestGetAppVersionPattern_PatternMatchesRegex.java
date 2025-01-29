package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAppVersionPattern_PatternMatchesRegex {

    @Test
    public void testGetAppVersionPattern_PatternMatchesRegex() {
        String pattern = "\\d{8}";
        Matcher matcher = AppVersion.getAppVersionPattern().matcher("1234567890");
        assertTrue(matcher.matches());
    }

}