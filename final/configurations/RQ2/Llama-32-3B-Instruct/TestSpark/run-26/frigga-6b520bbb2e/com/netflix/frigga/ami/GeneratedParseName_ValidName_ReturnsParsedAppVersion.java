package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_ValidName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidName_ReturnsParsedAppVersion() {
        String amiName = "1.0-ami.x86_64";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("x86_64", appVersion.getBuildJobName());
    }

}