package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedParseName_ValidName_ReturnsAppVersion {

    @Test
    public void parseName_ValidName_ReturnsAppVersion() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(amiName, appVersion.toString());
    }

}