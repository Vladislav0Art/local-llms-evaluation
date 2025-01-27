package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsCorrectPatternTest {

    @Test
    public void getAppVersionPattern_ReturnsCorrectPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("0.9.2-0").find());
    }

}