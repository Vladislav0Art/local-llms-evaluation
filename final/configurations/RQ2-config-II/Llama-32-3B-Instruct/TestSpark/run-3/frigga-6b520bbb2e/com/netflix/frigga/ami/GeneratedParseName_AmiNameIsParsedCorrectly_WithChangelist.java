package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_AmiNameIsParsedCorrectly_WithChangelist {

    @Test
    public void parseName_AmiNameIsParsedCorrectly_WithChangelist() {
        String amiName = "ubuntu/16.04/amazonLinux2/changelist123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("ubuntu", appVersion.getPackageName());
        assertEquals(4, appVersion.getVersion().length());
    }

}