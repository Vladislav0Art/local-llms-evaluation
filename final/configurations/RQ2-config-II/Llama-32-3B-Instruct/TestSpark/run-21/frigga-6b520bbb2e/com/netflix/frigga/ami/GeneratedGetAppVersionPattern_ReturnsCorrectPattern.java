package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsCorrectPattern {

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0.2-1234").find());
    }

}