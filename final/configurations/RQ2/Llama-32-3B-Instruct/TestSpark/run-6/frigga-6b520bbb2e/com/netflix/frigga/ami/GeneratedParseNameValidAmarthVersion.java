package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameValidAmarthVersion {

    @Test
    public void parseNameValidAmarthVersion() {
        String amiName = "amarth-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertTrue(appVersion.getPackageName().equals("com.netflix.apt"));
        assertTrue(appVersion.getVersion().equals("1.0"));
    }

}