package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsExpectedPattern {

    @Test
    public void getAppVersionPattern_ReturnsExpectedPattern() {
        String expectedPattern = "^[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]+-(?:[a-zA-Z0-9.-]+)\\.[a-zA-Z0-9]+$";
        Pattern actualPattern = AppVersion.getAppVersionPattern();
        assertTrue(actualPattern.matcher("example-1234567890").find());
    }

}