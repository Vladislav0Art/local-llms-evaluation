package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameValidAmiName_ReturnsAppVersion {

    @Test
    public void parseNameValidAmiName_ReturnsAppVersion() {
        String amiName = "1.0.0-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}