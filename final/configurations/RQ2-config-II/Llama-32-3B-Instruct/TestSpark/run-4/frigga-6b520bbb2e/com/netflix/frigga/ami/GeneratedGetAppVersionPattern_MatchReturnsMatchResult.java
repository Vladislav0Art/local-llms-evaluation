package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_MatchReturnsMatchResult {

    @Test
    public void getAppVersionPattern_MatchReturnsMatchResult() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.2-123456");
        assertTrue(matcher.matches());
    }

}