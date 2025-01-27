package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternReturnsCorrectRegex {

    @Test
    public void getAppVersionPatternReturnsCorrectRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.2.3-ami-amzn2").matches());
    }

}