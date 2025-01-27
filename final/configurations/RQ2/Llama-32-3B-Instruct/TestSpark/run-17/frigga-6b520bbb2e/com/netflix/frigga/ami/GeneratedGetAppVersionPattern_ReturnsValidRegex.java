package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedGetAppVersionPattern_ReturnsValidRegex {

    @Test
    public void getAppVersionPattern_ReturnsValidRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matches("ami-[a-f0-9]+"));
    }

}