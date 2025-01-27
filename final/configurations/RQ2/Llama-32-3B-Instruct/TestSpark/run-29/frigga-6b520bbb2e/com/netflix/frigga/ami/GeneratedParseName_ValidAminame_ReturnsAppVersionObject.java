package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedParseName_ValidAminame_ReturnsAppVersionObject {

    @Test
    public void parseName_ValidAminame_ReturnsAppVersionObject() {
        String amiName = "1.0-123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(amiName, appVersion.getVersion());
    }

}