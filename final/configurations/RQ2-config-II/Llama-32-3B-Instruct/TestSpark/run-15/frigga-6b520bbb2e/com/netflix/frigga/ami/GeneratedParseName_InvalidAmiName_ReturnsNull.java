package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmiName_ReturnsNull {

    @Test
    public void parseName_InvalidAmiName_ReturnsNull() {
        String invalidName = "invalid-name";
        AppVersion appVersion = AppVersion.parseName(invalidName);
        assertNull(appVersion);
    }

}