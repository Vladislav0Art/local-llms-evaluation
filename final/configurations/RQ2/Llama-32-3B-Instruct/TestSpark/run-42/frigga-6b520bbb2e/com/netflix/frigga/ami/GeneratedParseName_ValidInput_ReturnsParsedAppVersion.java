package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_ValidInput_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "ami-1234abcde7890fghi123";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed);
    }

}