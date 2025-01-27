package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidInput_ReturnsNull {

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        String amiName = " invalid input ";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}