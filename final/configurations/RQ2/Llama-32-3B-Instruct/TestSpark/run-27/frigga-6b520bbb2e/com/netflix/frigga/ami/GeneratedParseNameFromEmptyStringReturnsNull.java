package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameFromEmptyStringReturnsNull {

    @Test
    public void parseNameFromEmptyStringReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

}