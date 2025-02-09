package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ValidPattern_ReturnsExpectedPattern {

    @Test
    public void getAppVersionPattern_ValidPattern_ReturnsExpectedPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        String expectedPattern = "^[0-9]+\\.[0-9]+(-[a-z]+-x\\w+)-(\\w+)\\-[a-z]+$";
        assertEquals(expectedPattern, pattern.pattern());
    }

}