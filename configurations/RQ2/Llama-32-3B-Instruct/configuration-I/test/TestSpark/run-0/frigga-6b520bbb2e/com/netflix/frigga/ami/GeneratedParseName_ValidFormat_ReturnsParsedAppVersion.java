package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedParseName_ValidFormat_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidFormat_ReturnsParsedAppVersion() {
        String amiName = "my-app-1.2.3";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals(amiName, parsedAppVersion.toString());
        assertEquals("my-app", parsedAppVersion.getPackageName());
        assertEquals("1.2.3", parsedAppVersion.getVersion());
    }

}