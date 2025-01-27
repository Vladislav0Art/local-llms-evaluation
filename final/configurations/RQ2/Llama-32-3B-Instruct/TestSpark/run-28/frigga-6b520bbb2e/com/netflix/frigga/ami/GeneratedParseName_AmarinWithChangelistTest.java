package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_AmarinWithChangelistTest {

    @Test
    public void parseName_AmarinWithChangelistTest() {
        String amiName = "0.9.2-0-12345";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("0.9.2", appVersion.getVersion());
        assertEquals("0", appVersion.getBuildNumber());
    }

}