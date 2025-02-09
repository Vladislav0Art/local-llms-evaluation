package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidPattern_ReturnsAppVersion {

    @Test
    public void parseName_ValidPattern_ReturnsAppVersion() {
        String amiName = "1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

}