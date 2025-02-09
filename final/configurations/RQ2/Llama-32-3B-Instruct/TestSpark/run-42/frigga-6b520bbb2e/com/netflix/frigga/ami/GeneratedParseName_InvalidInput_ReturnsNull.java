package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_InvalidInput_ReturnsNull {

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        String amiName = "invalid-input";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

}