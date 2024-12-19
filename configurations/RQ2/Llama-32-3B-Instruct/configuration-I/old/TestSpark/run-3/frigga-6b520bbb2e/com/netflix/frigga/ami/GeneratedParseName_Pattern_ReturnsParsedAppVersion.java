package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_Pattern_ReturnsParsedAppVersion {

    @Test
    public void parseName_Pattern_ReturnsParsedAppVersion() {
        String amiName = "v1.2.3";
        AppVersion expected = new AppVersion("v1.2.3");
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals(expected, parsedName);
    }

}