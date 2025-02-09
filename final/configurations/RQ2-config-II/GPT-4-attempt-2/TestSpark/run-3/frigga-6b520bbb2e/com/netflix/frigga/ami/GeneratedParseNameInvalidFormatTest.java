package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedParseNameInvalidFormatTest {

    @Test
    public void parseNameInvalidFormatTest() {
        String amiName = "invalid";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(null, appVersion);
    }

}