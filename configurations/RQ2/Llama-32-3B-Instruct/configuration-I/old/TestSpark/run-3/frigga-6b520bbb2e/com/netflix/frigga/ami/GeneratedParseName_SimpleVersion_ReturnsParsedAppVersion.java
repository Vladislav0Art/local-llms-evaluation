package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_SimpleVersion_ReturnsParsedAppVersion {

    @Test
    public void parseName_SimpleVersion_ReturnsParsedAppVersion() {
        String amiName = "1.2.3";
        AppVersion expected = new AppVersion("1.2.3");
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals(expected, parsedName);
    }

}