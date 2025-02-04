package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameNullReturnsNull {

    @Test
    public void parseNameNullReturnsNull() {
        AppVersion parsed = AppVersion.parseName(null);
        assertNotNull(parsed);
        assertNull(parsed.packageName);
        assertNull(parsed.version);
    }

}