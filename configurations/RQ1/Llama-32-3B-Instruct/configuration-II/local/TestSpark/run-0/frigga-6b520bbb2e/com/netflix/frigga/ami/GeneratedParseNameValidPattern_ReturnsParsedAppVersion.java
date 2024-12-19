package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseNameValidPattern_ReturnsParsedAppVersion {

    @Test
    public void parseNameValidPattern_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

}