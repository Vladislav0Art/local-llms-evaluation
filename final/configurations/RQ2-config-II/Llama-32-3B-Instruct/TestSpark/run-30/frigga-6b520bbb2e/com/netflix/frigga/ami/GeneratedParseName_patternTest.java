package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedParseName_patternTest {

    @Test
    public void parseName_patternTest() {
        String amiName = "1.0.2-EC2-20210122";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher(amiName);
        assertTrue(matcher.matches());
    }

}