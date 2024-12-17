package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_ValidInput_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "1.0-rc2";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals("1.0", parsedAppVersion.getVersion());
        assertEquals("rc2", parsedAppVersion.getChangelist()); // deprecated
    }

}