package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_ReturnsAppVersionPattern {

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("com.netflix.frigga.ami:1.2.3").find());
    }

}