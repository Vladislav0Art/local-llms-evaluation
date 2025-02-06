package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedParseName_invalidPatternTest {

    @Test
    public void parseName_invalidPatternTest() {
        String amiName = "invalid-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}