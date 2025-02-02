package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_InvalidString_ReturnsNull {

    @Test
    public void parseName_InvalidString_ReturnsNull() {
        String amiName = "invalid-string";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}