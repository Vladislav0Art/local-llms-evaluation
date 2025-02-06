package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedParseName_ValidString_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidString_ReturnsParsedAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.0-ami-1234567890");
        assertNotNull(appVersion);
        assertEquals(1, Integer.parseInt(appVersion.getVersion().split("-")[0]));
    }

}