package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedParseName_MalformedName_ThrowsRegexException {

    @Test
    public void parseName_MalformedName_ThrowsRegexException() {
        String amiName = "InvalidName";
        try {
            AppVersion.parseName(amiName);
            fail("Expected RegexException");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
    }

}