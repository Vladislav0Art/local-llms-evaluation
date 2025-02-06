package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidFormat_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidFormat_ReturnsParsedAppVersion() {
        String validFormat = "com.netflix.frigga.ami:1.2.3";
        AppVersion parsedAppVersion = AppVersion.parseName(validFormat);
        assertNotNull(parsedAppVersion);
    }

}