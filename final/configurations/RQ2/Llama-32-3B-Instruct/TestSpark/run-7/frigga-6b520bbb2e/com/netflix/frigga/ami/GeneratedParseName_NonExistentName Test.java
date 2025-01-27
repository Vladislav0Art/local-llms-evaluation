package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_NonExistentName Test {

    @Test
    public void parseName_NonExistentName

    Test() {
        String amiName = "99999";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}