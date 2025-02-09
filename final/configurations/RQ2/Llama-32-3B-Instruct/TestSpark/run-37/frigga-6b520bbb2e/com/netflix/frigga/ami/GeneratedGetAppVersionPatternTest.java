package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        String expected = "amarhub\\d+\\.\\d+";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher(expected).find());
    }

}