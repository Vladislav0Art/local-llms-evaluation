package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmarinTest {

    @Test
    public void parseName_InvalidAmarinTest() {
        String amiName = "Invalid";
        assertTrue(AppVersion.parseName(amiName) == null);
    }

}