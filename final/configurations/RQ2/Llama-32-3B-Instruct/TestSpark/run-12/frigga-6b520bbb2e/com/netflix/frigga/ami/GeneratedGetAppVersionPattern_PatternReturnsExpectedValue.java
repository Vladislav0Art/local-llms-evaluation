package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_PatternReturnsExpectedValue {

    @Test
    public void getAppVersionPattern_PatternReturnsExpectedValue() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ami-0e4a7d9f-2d64-43c5-bb11-8a7d81ea5604").find());
    }

}