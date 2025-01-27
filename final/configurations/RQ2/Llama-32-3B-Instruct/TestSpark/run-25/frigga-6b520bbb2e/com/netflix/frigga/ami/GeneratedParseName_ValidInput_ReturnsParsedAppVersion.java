package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidInput_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "1.0-1";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
    }

}