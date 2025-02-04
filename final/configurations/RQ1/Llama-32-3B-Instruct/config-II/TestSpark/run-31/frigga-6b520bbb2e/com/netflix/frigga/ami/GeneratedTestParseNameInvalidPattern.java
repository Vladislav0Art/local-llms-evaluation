package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseNameInvalidPattern {

    @Test
    public void testParseNameInvalidPattern() {
        String amiName = "invalid-pattern";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}