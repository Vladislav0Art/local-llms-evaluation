package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MultipleWords_ReturnsCorrectlyParsedAppVersion {

    @Test
    public void parseName_MultipleWords_ReturnsCorrectlyParsedAppVersion() {
        AppVersion appVersion = AppVersion.parseName("aws-app-1234-1234-1234-12345");
        assertTrue(appVersion.getPackageName().equals("aws-app"));
    }

}