package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MissingPrefix_ReturnsNull {

    private AppVersion appVersion;

    @Test
    public void parseName_MissingPrefix_ReturnsNull() {
        String amiName = "region-1234";
        assertNull(appVersion.parseName(amiName));
    }

}