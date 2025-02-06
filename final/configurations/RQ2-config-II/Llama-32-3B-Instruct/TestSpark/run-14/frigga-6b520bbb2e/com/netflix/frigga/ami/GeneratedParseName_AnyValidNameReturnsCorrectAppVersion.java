package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedParseName_AnyValidNameReturnsCorrectAppVersion {

    @Test
    public void parseName_AnyValidNameReturnsCorrectAppVersion() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.getVersion());
        assertNotNull(appVersion.getBuildNumber());
        assertNotNull(appVersion.getCommit());
    }

}