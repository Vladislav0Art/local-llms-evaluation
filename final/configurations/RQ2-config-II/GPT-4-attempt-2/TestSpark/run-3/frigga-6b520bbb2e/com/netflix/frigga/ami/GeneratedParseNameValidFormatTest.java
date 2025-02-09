package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedParseNameValidFormatTest {

    @Test
    public void parseNameValidFormatTest() {
        String amiName = "testpackage-testversion-h0test.build";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("testpackage", appVersion.getPackageName());
        assertEquals("testversion", appVersion.getVersion());
        assertEquals("test.build", appVersion.getBuildJobName());
    }

}