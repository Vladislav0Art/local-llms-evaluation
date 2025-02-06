package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_MatchesValidFormat ReturnsPattern {

    @Test
    public void getAppVersionPattern_MatchesValidFormat

    ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.0-1234").find());
    }

}