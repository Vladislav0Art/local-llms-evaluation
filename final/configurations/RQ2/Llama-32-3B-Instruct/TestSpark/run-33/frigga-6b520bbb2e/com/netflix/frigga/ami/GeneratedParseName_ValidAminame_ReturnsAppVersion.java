package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidAminame_ReturnsAppVersion {

    @Test
    public void parseName_ValidAminame_ReturnsAppVersion() {
        String amiName = "0.9.1-EC2-X86_64-GP2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}