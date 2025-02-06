package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetAppVersionPattern_ReturnsCorrectAppVersionPattern {

    @Test
    public void getAppVersionPattern_ReturnsCorrectAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0.0-RC2").matches());
    }

}