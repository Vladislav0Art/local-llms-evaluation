package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetAppVersionPattern_MatchesValidPattern_ReturnsMatchedPattern {

    @Test
    public void getAppVersionPattern_MatchesValidPattern_ReturnsMatchedPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.0-ami-1234567890");
        assertTrue(matcher.matches());
    }

}