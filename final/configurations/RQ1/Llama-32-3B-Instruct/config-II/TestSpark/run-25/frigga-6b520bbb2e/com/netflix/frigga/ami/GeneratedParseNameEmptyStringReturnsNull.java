package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameEmptyStringReturnsNull {

    @Test
    public void parseNameEmptyStringReturnsNull() {
        AppVersion parsed = AppVersion.parseName("");
        assertNotNull(parsed);
        assertNull(parsed.packageName);
        assertNull(parsed.version);
    }

}