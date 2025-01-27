package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedToString_ReturnsValidString {

    @Test
    public void toString_ReturnsValidString() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertTrue(appVersion.toString().matches("^ami-[a-f0-9]+"));
    }

}