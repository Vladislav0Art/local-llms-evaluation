package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_NullString_ReturnsNull {

    @Test
    public void parseName_NullString_ReturnsNull() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}