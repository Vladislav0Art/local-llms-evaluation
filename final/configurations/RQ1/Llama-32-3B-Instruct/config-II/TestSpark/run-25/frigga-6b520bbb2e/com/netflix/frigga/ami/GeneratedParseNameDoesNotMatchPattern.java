package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameDoesNotMatchPattern {

    @Test
    public void parseNameDoesNotMatchPattern() {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

}