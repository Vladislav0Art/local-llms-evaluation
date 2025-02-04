package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_GivenNullReturnsNull {

    @Test
    public void parseName_GivenNullReturnsNull() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}