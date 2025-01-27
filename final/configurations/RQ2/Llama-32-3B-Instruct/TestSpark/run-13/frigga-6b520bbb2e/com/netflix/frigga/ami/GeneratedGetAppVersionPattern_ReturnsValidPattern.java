package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsValidPattern {

    @Test
    public void getAppVersionPattern_ReturnsValidPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matches("^[a-zA-Z]+\\.[0-9]+$"));
    }

}