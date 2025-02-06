package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_SingleWord_ReturnsCorrectlyParsedVersion {

    @Test
    public void getVersion_SingleWord_ReturnsCorrectlyParsedVersion() {
        String version = "1234";
        AppVersion appVersion = AppVersion.parseName("aws-app-" + version);
        assertEquals(version, appVersion.getVersion());
    }

}