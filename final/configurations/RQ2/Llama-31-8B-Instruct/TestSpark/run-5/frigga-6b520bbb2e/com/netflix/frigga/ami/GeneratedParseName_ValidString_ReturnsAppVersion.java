package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedParseName_ValidString_ReturnsAppVersion {

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-name-1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals(amiName, result.toString());
    }

}