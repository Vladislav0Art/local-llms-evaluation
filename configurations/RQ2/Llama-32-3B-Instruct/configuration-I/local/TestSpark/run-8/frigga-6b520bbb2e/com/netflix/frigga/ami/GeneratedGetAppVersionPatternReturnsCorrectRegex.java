package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedGetAppVersionPatternReturnsCorrectRegex {

    @Test
    public void getAppVersionPatternReturnsCorrectRegex() {
        Pattern pattern = Pattern.compile("^\\d+\\.\\d+$");
        assertEquals(pattern, AppVersion.getAppVersionPattern());
    }

}