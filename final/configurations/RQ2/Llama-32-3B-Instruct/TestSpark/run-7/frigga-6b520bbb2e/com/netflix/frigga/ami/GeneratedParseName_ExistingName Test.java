package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ExistingName Test {

    @Test
    public void parseName_ExistingName

    Test() {
        String amiName = "1.0-123456789";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("123456789", appVersion.getBuildNumber());
    }

}