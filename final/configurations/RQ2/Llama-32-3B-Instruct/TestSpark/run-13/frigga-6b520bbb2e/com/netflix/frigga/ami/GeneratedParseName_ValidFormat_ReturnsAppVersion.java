package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidFormat_ReturnsAppVersion {

    @Test
    public void parseName_ValidFormat_ReturnsAppVersion() {
        String amiName = "1.0-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(amiName, appVersion.getVersion());
    }

}