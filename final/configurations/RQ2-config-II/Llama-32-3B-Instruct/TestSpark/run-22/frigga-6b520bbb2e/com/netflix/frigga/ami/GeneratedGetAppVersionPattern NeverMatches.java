package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern NeverMatches {

    @Test
    public void getAppVersionPattern

    NeverMatches() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertFalse(pattern.matcher("unknown").find());
    }

}