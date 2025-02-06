package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_SimpleAppVersion_ReturnsParsedAppVersion {

    private AppVersion appVersion;

    @Test
    public void parseName_SimpleAppVersion_ReturnsParsedAppVersion() {
        String amiName = "ami-1234";
        Matcher matcher = Pattern.compile("[^a-zA-Z0-9]+$").matcher(amiName);
        assertEquals("ami-1234", appVersion.parseName(amiName));
    }

}