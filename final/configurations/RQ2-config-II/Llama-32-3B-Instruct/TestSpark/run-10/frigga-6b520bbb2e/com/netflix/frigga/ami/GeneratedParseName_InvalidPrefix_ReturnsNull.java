package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidPrefix_ReturnsNull {

    private AppVersion appVersion;

    @Test
    public void parseName_InvalidPrefix_ReturnsNull() {
        String amiName = "-1234";
        assertNull(appVersion.parseName(amiName));
    }

}