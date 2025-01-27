package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmiName {

    @Test
    public void parseName_InvalidAmiName() {
        String amiName = "InvalidAmiName";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}