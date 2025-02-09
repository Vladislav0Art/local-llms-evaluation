package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternReturnsExpectedRegex {

    @Test
    public void getAppVersionPatternReturnsExpectedRegex() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0.2-20220101").find());
        assertFalse(pattern.matcher("invalid-ami-name").find());
    }

}