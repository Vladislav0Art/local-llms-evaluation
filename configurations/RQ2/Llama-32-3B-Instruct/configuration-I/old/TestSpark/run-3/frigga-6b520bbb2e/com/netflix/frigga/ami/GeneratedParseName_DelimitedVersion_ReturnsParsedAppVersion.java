package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_DelimitedVersion_ReturnsParsedAppVersion {

    @Test
    public void parseName_DelimitedVersion_ReturnsParsedAppVersion() {
        String amiName = "1.2.3-4";
        AppVersion expected = new AppVersion("1.2.3-4");
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertEquals(expected, parsedName);
    }

}