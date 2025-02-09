package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedParseName_SimpleAppVersion_ReturnsParsedAppVersion {

    @Test
    public void parseName_SimpleAppVersion_ReturnsParsedAppVersion() {
        String amiName = "my-package/my-version";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertTrue(parsedAppVersion.getPackageName().equals("my-package"));
        assertTrue(parsedAppVersion.getVersion().equals("my-version"));
    }

}